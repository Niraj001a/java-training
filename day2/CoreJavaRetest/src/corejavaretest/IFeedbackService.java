package corejavaretest;



import java.util.List;

public interface IFeedbackService {

	Feedback add(String description, String authorName) throws InvalidDescription, InvalidAuthorName;



    List<Feedback> findFeedbacksByAuthorOrderById();

}
