package corejavaretest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedbackService implements IFeedbackService {

    private Map<Long, Feedback> feedbackStore;
    private long nextId;

    public FeedbackService() {
        feedbackStore = new HashMap<>();
        nextId = 1;
    }

    @Override
    public Feedback add(String authorName,String description) throws InvalidDescription, InvalidAuthorName {
        if ( description.length() < 5 || description.length() > 50) {
            throw new InvalidDescription("Description should be between 5 and 50 characters.");
        }

        if ( authorName.length() < 2 || authorName.length() > 20 || !authorName.matches("^[a-zA-Z]+$")) {
            throw new InvalidAuthorName("Author name should be between 2 and 20 characters and contain only letters.");
        }

        long feedbackId = nextId++;
        Feedback feedback = new Feedback(feedbackId, description, authorName);
        feedbackStore.put(feedbackId, feedback);
        return feedback;
    }


    @Override
    public List<Feedback> findFeedbacksByAuthorOrderById() {
        List<Feedback> feedbacks = new ArrayList<>(feedbackStore.values());
        feedbacks.sort(Comparator.comparing(Feedback::getId));
        return feedbacks;
    }

}

