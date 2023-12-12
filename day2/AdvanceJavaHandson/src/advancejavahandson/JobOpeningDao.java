package advancejavahandson;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

class JobOpeningDao implements IJobOpeningDao {
    private Map<Long, JobOpening> inMemoryStore = new HashMap<>();
    private long idCounter = 1;

    @Override
    public JobOpening save(JobOpening job) {
        job.setId(idCounter++);
        inMemoryStore.put(job.getId(), job);
        return job;
    }

    @Override
    public Optional<JobOpening> findById(long id) {
        return Optional.ofNullable(inMemoryStore.get(id));
    }

    @Override
    public Set<JobOpening> findAllJobs() {
        return new HashSet<>(inMemoryStore.values());
    }

    @Override
    public JobOpening update(JobOpening jobOpening) {
        inMemoryStore.put(jobOpening.getId(), jobOpening);
        return jobOpening;
    }
}