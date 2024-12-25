abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;


    public Employee(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


    public abstract double calculateSalary();


    public void printDetails() {
        System.out.println("სახელი: " + firstName);
        System.out.println("გვარი: " + lastName);
        System.out.println("ტელეფონის ნომერი: " + phoneNumber);
    }
}
