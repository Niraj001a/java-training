package jpahandson;

//User Management Module

//Domain Entity
@Entity
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(nullable = false, length = 10)
 private String firstName;

 @Column(nullable = false, length = 10)
 private String lastName;

 @OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL)
 private List<Feedback> feedbacks = new ArrayList<>();

 // Constructors, getters, setters, etc.
}

//Data Access
public interface IUserDao extends JpaRepository<User, Long> {
 // Additional methods if needed
}

//Service Contract
public interface IUserService {
 User register(String firstname, String lastname) throws InvalidUsernameException;

 User findById(long userId) throws InvalidUserIdException, UserNotFoundException;
}
