import java.time.LocalDate;

public record Student(
   String firstName,
   String lastName,
   LocalDate dateOfBirth
) {
    public void screamYourName(){
        System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase());
    }
}
