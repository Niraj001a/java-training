package advancejavahandson;


import java.util.Set;

class JobOpening {
    private long id;
    private String description;
    private String postedByCompany;
    private Skill skillRequired;
    private Set<JobApplication> receivedApplications;
	public JobOpening(long id, String description, String postedByCompany, Skill skillRequired,
			Set<JobApplication> receivedApplications) {
		super();
		this.id = id;
		this.description = description;
		this.postedByCompany = postedByCompany;
		this.skillRequired = skillRequired;
		this.receivedApplications = receivedApplications;
	}
	
	
	public JobOpening() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPostedByCompany() {
		return postedByCompany;
	}
	public void setPostedByCompany(String postedByCompany) {
		this.postedByCompany = postedByCompany;
	}
	public Skill getSkillRequired() {
		return skillRequired;
	}
	public void setSkillRequired(Skill skillRequired) {
		this.skillRequired = skillRequired;
	}
	public Set<JobApplication> getReceivedApplications() {
		return receivedApplications;
	}
	public void setReceivedApplications(Set<JobApplication> receivedApplications) {
		this.receivedApplications = receivedApplications;
	}


	@Override
	public String toString() {
		return "JobOpening [id=" + id + ", description=" + description + ", postedByCompany=" + postedByCompany
				+ ", skillRequired=" + skillRequired + ", receivedApplications=" + receivedApplications + "]";
	}

    
    
}