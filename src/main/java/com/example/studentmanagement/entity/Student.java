@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @NotBlank(message = "Name is required")
    private String name;

    @Min(value = 5, message = "Minimum age is 5")
    @Max(value = 100, message = "Maximum age is 100")
    private int age;

    @NotBlank(message = "Class is required")
    private String studentClass;

    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    // Getters and setters
}
