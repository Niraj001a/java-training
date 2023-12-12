package advJavaRetest;

import java.util.List;

public interface IJobOpeningService {
    JobOpening createJobOpening(String company, String description, Skill skill);
    JobOpening findJobById(long jobId);
    void applyForJob(long jobId, String firstName, String lastName);
    List<JobOpening> findAllOpeningsPostedByCompanyOrderBySkill(String company, Skill skill);
    List<JobApplication> findAllApplicationsByJobIdOrderedByFirstName(long jobId);
}