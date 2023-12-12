package pincheck;

import java.util.*;

public class RecruitmentPlatform {
    private List<JobOpening> jobOpenings = new ArrayList<>();
    private List<JobApplication> jobApplications = new ArrayList<>();

    public static void main(String[] args) {
        // Example usage
        RecruitmentPlatform platform = new RecruitmentPlatform();

       

       

       

       

      
    }

    public void createJobOpening(String companyName, String description, String skill)
             {
        validateCompanyName(companyName);
        validateDescription(description);

        JobOpening jobOpening = new JobOpening(companyName, description, skill);
        jobOpenings.add(jobOpening);
    }

    public JobOpening findJobById(int jobId) {
        

        for (JobOpening job : jobOpenings) {
            if (job.getId() == jobId) {
                return job;
            }
        }
		return null;

        
    }

    public void applyForJob(int jobId, String firstName, String lastName)
            {
        
        validateApplicantName(firstName);
        validateApplicantName(lastName);

        JobApplication application = new JobApplication(jobId, firstName, lastName);
        jobApplications.add(application);
    }

    public List<JobOpening> findAllOpeningsByCompany(String companyName, String skill) {
        validateCompanyName(companyName);

        List<JobOpening> companyOpenings = new ArrayList<>();
        for (JobOpening job : jobOpenings) {
            if (job.getCompanyName().equals(companyName) && job.getSkill().equals(skill)) {
                companyOpenings.add(job);
            }
        }

        companyOpenings.sort(Comparator.comparing(JobOpening::getSkill));
        return companyOpenings;
    }

    public List<JobApplication> findAllApplicationsByJobId(int jobId)
             {
      

        List<JobApplication> jobApplicationsList = new ArrayList<>();
        for (JobApplication application : jobApplications) {
            if (application.getJobId() == jobId) {
                jobApplicationsList.add(application);
            }
        }

        jobApplicationsList.sort(Comparator.comparing(JobApplication::getFirstName));
        return jobApplicationsList;
    }

    private void validateCompanyName(String companyName) {
        if (companyName.length() < 2 || companyName.length() > 15 || !companyName.matches("[a-zA-Z0-9]+")) {
            
        }
    }

    private void validateDescription(String description)  {
        if (description.length() < 2 || description.length() > 100) {
           
        }
    }

    

    private void validateApplicantName(String name)  {
        if (name.length() < 2 || name.length() > 10 || !name.matches("[a-zA-Z0-9]+")) {

        }
    }
}

class JobOpening {
    private static int nextId = 1;

    private int id;
    private String companyName;
    private String description;
    private String skill;

    public JobOpening(String companyName, String description, String skill) {
        this.id = nextId++;
        this.companyName = companyName;
        this.description = description;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDescription() {
        return description;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return "JobOpening{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", description='" + description + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}

class JobApplication {
    private static int nextId = 1;

    private int id;
    private int jobId;
    private String firstName;
    private String lastName;

    public JobApplication(int jobId, String firstName, String lastName) {
        this.id = nextId++;
        this.jobId = jobId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public int getJobId() {
        return jobId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "JobApplication{" +
                "id=" + id +
                ", jobId=" + jobId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}








