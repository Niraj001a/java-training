package job;
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
