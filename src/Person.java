public class Person {
    private String firstName;
    private String lastName;
    private int yearOfBirthday;
    private int montOfBirthday;
    private int dayOfBirthday;
    private static int CURRENT_YEAR = 2024;

    public Person(){

    }
    public Person(String firstName, String lastName, int yearOfBirthday, int montOfBirthday, int dayOfBirthday){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirthday = yearOfBirthday;
        this.montOfBirthday = montOfBirthday;
        this.dayOfBirthday = dayOfBirthday;
    }

    public Person(String firstName, String lastName, int yearOfBirthday){
        this(firstName, lastName, yearOfBirthday, 12, 25);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    public int getMontOfBirthday() {
        return montOfBirthday;
    }

    public void setMontOfBirthday(int montOfBirthday) {
        this.montOfBirthday = montOfBirthday;
    }

    public int getDayOfBirthday() {
        return dayOfBirthday;
    }

    public void setDayOfBirthday(int dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }


    // define method for return fullName
    public String getFullName(){
        return firstName + " " + lastName;
    }

    // define method to get child
    public Person getFirstChild(){
        Person person = new Person();
        person.firstName = firstName;
        person.lastName = lastName + " II";

        return person;
    }
    // define method to know if person is adult
    public boolean isAdult(){
        int age = CURRENT_YEAR - yearOfBirthday;
        return age >= 18;
    }

    // define method to calculate age
    public int getAge(){
        return CURRENT_YEAR - yearOfBirthday;
    }

    // methods overload
    // define method to say hi
    public String sayHi(){
        return "Hello my name is: " + firstName;
    }

    // define method to say hi
    String sayHi(Person person){
        return "Hello: " + person.getFullName();
    }


}
