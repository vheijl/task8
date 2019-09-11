package search;
import java.time.LocalDate;

public class Person {

    public String fullName;
    public String firstName;
    public String lastName;
    private LocalDate dateOfBirth;
    private String telephoneNumber;


    public Person() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.fullName = createFullName(this.firstName, this.lastName); 
        this.dateOfBirth = LocalDate.now();
        this.telephoneNumber = "0000000000";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = createFullName(this.firstName, this.lastName);
        this.dateOfBirth = LocalDate.now();
        this.telephoneNumber = "0000000000";
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = createFullName(this.firstName, this.lastName);
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = "0000000000";
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = createFullName(this.firstName, this.lastName);
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
    }

    public String getDob() {
        return this.dateOfBirth.toString();
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    private String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}