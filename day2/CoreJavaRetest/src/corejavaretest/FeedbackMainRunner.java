package corejavaretest;

import java.util.List;
import java.util.Scanner;

public class FeedbackMainRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IFeedbackService feedbackService = new FeedbackService();

		try {
			feedbackService.add("Sachin", "I love Cricket");
			feedbackService.add("Ram", "The bikes produce too much heat");
			feedbackService.add("Niraj", "Cricket is Nice and interesting games");

			System.out.println("Feedbacks added successfully:");
			List<Feedback> feedbacksByAuthor = feedbackService.findFeedbacksByAuthorOrderById();

//			Printing all author id,author Name and Feedback
			for (Feedback feedback : feedbacksByAuthor) {

				System.out.println("Author Id: " + feedback.getId());
				System.out.println("Author Name: " + feedback.getAuthor());
				System.out.println("Feedback: " + feedback.getDescription());
				System.out.println();

			}

//			Searching Feedback by Author id 
			System.out.println("\nFind feedback by ID:");
			long idToFind = sc.nextLong();
			sc.nextLine();
			boolean flag1 = false;
			boolean flag2 = false;
			for (Feedback feedback : feedbacksByAuthor) {
				if (feedback.getId() == idToFind) {
					flag1 = true;
					System.out.println("Author Id: " + feedback.getId());
					System.out.println("Author Name: " + feedback.getAuthor());
					System.out.println("Feedback: " + feedback.getDescription());
				}
				
			}
			if (!flag1) {

				System.out.println("No Feedback found with this ID");
			}

//			Searching Feedback by Author Name
			System.out.println("\nFind feedbacks by author name:");
			String authorName = sc.nextLine();
//			List<Feedback> feedbacksByAuthor = feedbackService.findFeedbacksByAuthorOrderById();
			for (Feedback feedback : feedbacksByAuthor) {
				if (feedback.getAuthor().equalsIgnoreCase(authorName)) {
					flag2 = true;
					System.out.println("Author Id: " + feedback.getId());
					System.out.println("Author Name: " + feedback.getAuthor());
					System.out.println("Feedback: " + feedback.getDescription());
				}
				
			}
			if (!flag2) {

				System.out.println("No Feedback found with this ID");
			}
		} catch (InvalidDescription | InvalidAuthorName e) {
			System.err.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
