package advJavaRetest;
import java.util.*;
import java.util.stream.Collectors;

interface IJobOpeningDao {
    JobOpening save(JobOpening job);
    Optional<JobOpening> findById(long id);
    Set<JobOpening> findAllJobs();
    JobOpening update(JobOpening jobOpening);
}