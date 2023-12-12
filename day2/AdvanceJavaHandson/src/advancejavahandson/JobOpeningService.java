package advancejavahandson;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class JobOpeningService implements IJobOpeningService {

    private final IJobOpeningDao jobOpeningDao;

    public JobOpeningService(IJobOpeningDao jobOpeningDao) {
        this.jobOpeningDao = jobOpeningDao;
    }

    @Override
    public JobOpening createJobOpening(String company, String description, Skill skill) {
        validateCompany(company);
        validateDescription(description);

        JobOpening jobOpening = new JobOpening();
        jobOpening.setPostedByCompany(company);
        jobOpening.setDescription(description);
        jobOpening.setSkillRequired(skill);
        jobOpening.setReceivedApplications(new HashSet<>());

        return jobOpeningDao.save(jobOpening);
    }

    @Override
    public JobOpening findJobById(long jobId) {
        validateJobId(jobId);
        return jobOpeningDao.findById(jobId).orElseThrow(() -> new RuntimeException("Job not found for ID: " + jobId));
    }

    @Override
    public void applyForJob(long jobId, String firstName, String lastName) {
        validateJobId(jobId);
        validateApplicantName(firstName);
        validateApplicantName(lastName);

        JobOpening jobOpening = findJobById(jobId);

        JobApplication jobApplication = new JobApplication();
        jobApplication.setFirstName(firstName);
        jobApplication.setLastName(lastName);

        jobOpening.getReceivedApplications().add(jobApplication);
        jobOpeningDao.update(jobOpening);
    }

    @Override
    public List<JobOpening> findAllOpeningsPostedByCompanyOrderBySkill(String company, Skill skill) {
        validateCompany(company);
        Objects.requireNonNull(skill);

        Set<JobOpening> allJobs = jobOpeningDao.findAllJobs();
        List<JobOpening> result = new ArrayList<>();

        for (JobOpening job : allJobs) {
            if (job.getPostedByCompany().equals(company) && job.getSkillRequired() == skill) {
                result.add(job);
            }
        }

        result.sort(Comparator.comparing(JobOpening::getSkillRequired));

        return result;
    }

    @Override
    public List<JobApplication> findAllApplicationsByJobIdOrderedByFirstName(long jobId) {
        validateJobId(jobId);

        JobOpening jobOpening = findJobById(jobId);
        List<JobApplication> applications = new ArrayList<>(jobOpening.getReceivedApplications());
        applications.sort(Comparator.comparing(JobApplication::getFirstName));

        return applications;
    }
    private void validateCompany(String company) {
        if (company == null || !company.matches("^[a-zA-Z0-9]+$") || company.length() < 2 || company.length() > 15) {
            throw new InvalidCompanyException("Invalid company name: " + company);
        }
    }

    private void validateDescription(String description) {
        if (description == null || description.length() < 2 || description.length() > 100) {
            throw new InvalidDescriptionException("Invalid description: " + description);
        }
    }

    private void validateJobId(long jobId) {
        if (jobId <= 0) {
            throw new InvalidJobIDException("Invalid job ID: " + jobId);
        }
    }

    private void validateApplicantName(String name) {
        if (name == null || !name.matches("^[a-zA-Z0-9]+$") || name.length() < 2 || name.length() > 10) {
            throw new InvalidApplicantNameException("Invalid applicant name: " + name);
        }
    }
}
