public class Main {
    public static void main(String[] args) {
        Person jose = new Person();
        jose.setFirstName("jose");
        jose.setLastName("diaz");
        jose.setYearOfBirthday(1998);

        Person person = new Person("pepe", "Grillo", 2000, 8, 22);
        printPerson(person);
        printPerson(jose);
    }
    static void printPerson(Person person){

        String message = String.format(
                "FirstName: %s, LastName: %s, yearOfBirthday: %d",
                person.getFirstName(), person.getLastName(), person.getYearOfBirthday());

        System.out.println(message);
    }
}
