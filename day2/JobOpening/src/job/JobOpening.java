package job;

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
