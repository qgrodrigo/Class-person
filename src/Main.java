import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person jose = new Person();
        jose.setFirstName("jose");
        jose.setLastName("diaz");
        jose.setYearOfBirthday(1998);

        Person person = new Person("pepe", "Grillo", 2000, 8, 22);
        printPerson(person);
        printPerson(jose);

        Student student = new Student("rodrigo", "quispe", LocalDate.of(2000, 1, 31));
        System.out.println(student);
        student.screamYourName();

        LabSection intro = new LabSection(0, "introduction");
        LabVideo video1 = new LabVideo(1, "video 01");

        System.out.println(intro.getSectionName());
        System.out.println(video1.getSectionName());
    }
    static void printPerson(Person person){

        String message = String.format(
                "FirstName: %s, LastName: %s, yearOfBirthday: %d",
                person.getFirstName(), person.getLastName(), person.getYearOfBirthday());

        System.out.println(message);
    }

}
