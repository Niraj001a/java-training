package jpahandson;

//Feedback Management Module

//Domain Entity
@Entity
public class Feedback {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(nullable = false, length = 50)
 private String description;

 @ManyToOne
 @JoinColumn(name = "createdByUserID", nullable = false)
 private User createdBy;

 @Enumerated(EnumType.STRING)
 @Column(nullable = false)
 private IssueType issue;

 // Constructors, getters, setters, etc.
}

//Enum for IssueType
public enum IssueType {
 PRODUCT_BROKEN,
 PRODUCT_QUALITY,
 DELIVERY_ISSUE
}

//Data Access Contract
public interface IFeedbackDao extends JpaRepository<Feedback, Long> {
 // Additional methods if needed
}

//Service Contract
public interface IFeedbackService {
 Feedback add(long createdByUserId, String description, IssueType issue)
         throws InvalidFeedbackDescription, InvalidUserIdException, UserNotFoundException;

 Feedback findById(long feedbackId) throws InvalidIDException, NoFeedbackFoundException;
}
