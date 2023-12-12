package advJavaRetest;

class JobOpeningService implements IJobOpeningService {
    private final IJobOpeningDao jobOpeningDao;

    public JobOpeningService(IJobOpeningDao jobOpeningDao) {
        this.jobOpeningDao = jobOpeningDao;
    }

    @Override
    public JobOpening createJobOpening(String company, String description, Skill skill) {
        validateCompany(company);
        validateDescription(description);

        JobOpening job = new JobOpening();
        job.setPostedByCompany(company);
        job.setDescription(description);
        job.setSkillRequired(skill);

        return jobOpeningDao.save(job);
    }

    @Override
    public JobOpening findJobById(long jobId) {
        validateJobId(jobId);

        return jobOpeningDao.findById(jobId)
                .orElseThrow(() -> new RuntimeException("Job not found"));
    }

    @Override
    public void applyForJob(long jobId, String firstName, String lastName) {
        validateJobId(jobId);
        validateApplicantName(firstName, "First name");
        validateApplicantName(lastName, "Last name");

        JobOpening job = findJobById(jobId);

        JobApplication application = new JobApplication();
        application.setFirstName(firstName);
        application.setLastName(lastName);

        job.addApplication(application);
        jobOpeningDao.update(job);
    }

    @Override
    public List<JobOpening> findAllOpeningsPostedByCompanyOrderBySkill(String company, Skill skill) {
        validateCompany(company);
        Objects.requireNonNull(skill);

        Set<JobOpening> openings = jobOpeningDao.findAllJobs().stream()
                .filter(job -> job.getPostedByCompany().equals(company) && job.getSkillRequired() == skill)
                .collect(Collectors.toSet());

        List<JobOpening> sortedOpenings = openings.stream()
                .sorted(Comparator.comparing(JobOpening::getSkillRequired))
                .collect(Collectors.toList());

        return sortedOpenings;
    }

    @Override
    public List<JobApplication> findAllApplicationsByJobIdOrderedByFirstName(long jobId) {
        validateJobId(jobId);

        JobOpening job = findJobById(jobId);
        List<JobApplication> applications = job.getReceivedApplications().stream()
                .sorted(Comparator.comparing(JobApplication::getFirstName))
                .collect(Collectors.toList());

        return applications;
    }

    // Validation methods
    private void validateCompany(String company) {
        if (company == null || !company.matches("[a-zA-Z0-9]{2,15}")) {
            throw new InvalidCompanyException("Invalid company name");
        }
    }

    private void validateDescription(String description) {
        if (description == null || description.length() < 2 || description.length() > 100) {
            throw new InvalidDescriptionException("Invalid description");
        }
    }

    private void validateJobId(long jobId) {
        if (jobId <= 0) {
            throw new InvalidJobIDException("Invalid job ID");
        }
    }

    private void validateApplicantName(String name, String fieldName) {
        if (name == null || !name.matches("[a-zA-Z0-9]{2,10}")) {
            throw new InvalidApplicantNameException("Invalid " + fieldName);
        }
    }
}

class JobOpeningDao implements IJobOpeningDao {
    private final Map<Long, JobOpening> jobStore = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public JobOpening save(JobOpening job) {
        job.setId(idGenerator.getAndIncrement());
        jobStore.put(job.getId(), job);
        return job;
    }

    @Override
    public Optional<JobOpening> findById(long id) {
        return Optional.ofNullable(jobStore.get(id));
    }

    @Override
    public Set<JobOpening> findAllJobs() {
        return new HashSet<>(jobStore.values());
    }

    @Override
    public JobOpening update(JobOpening jobOpening) {
        jobStore.put(jobOpening.getId(), jobOpening);
        return jobOpening;
    }
}