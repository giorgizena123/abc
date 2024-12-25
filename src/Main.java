import java.util.Scanner;
interface Drivable {
    void startEngine();
    void stopEngine();
}

// მეორე ინტერფეისი - Steerable
interface Steerable {
    void turnLeft();
    void turnRight();
}
public class Main {
    public static void main(String[] args) {
       //1)
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ წესიერი n-კუთხედის გვერდების რაოდენობა: ");
        int nSides = scanner.nextInt();
        System.out.println("შეიყვანეთ წესიერი n-კუთხედის თითოეული გვერდის სიგრძე: ");
        double nLength = scanner.nextDouble();

        RegularPolygon nPolygon = new RegularPolygon(nSides, nLength);
        System.out.println("წესიერი n-კუთხედის პერიმეტრი: " + nPolygon.perimeter());

        System.out.println("შეიყვანეთ კვადრატის გვერდის სიგრძე: ");
        double squareLength = scanner.nextDouble();
        Square square = new Square(squareLength);
        System.out.println("კვადრატის პერიმეტრი: " + square.perimeter());

        System.out.println("შეიყვანეთ ტოლგვერდა სამკუთხედის გვერდის სიგრძე: ");
        double triangleLength = scanner.nextDouble();
        EquilateralTriangle triangle = new EquilateralTriangle(triangleLength);
        System.out.println("ტოლგვერდა სამკუთხედის პერიმეტრი: " + triangle.perimeter());

        scanner.close();

//2)
        Triangle triangle1 = new Triangle(3, 4, 5, "სამკუთხედი");
        System.out.println("სამკუთხედის მონაცემები:");
        triangle1.printDetails();
        System.out.println("სამკუთხედის პერიმეტრი: " + triangle1.perimeter());

        System.out.println();


        Rectangle rectangle = new Rectangle(5, 10, "ოთხკუთხედი");
        System.out.println("ოთხკუთხედის მონაცემები:");
        rectangle.printDetails();
        System.out.println("ოთხკუთხედის პერიმეტრი: " + rectangle.perimeter());
//3)
        Car car = new Car("Sport Car", 50.0, 10.0, 4, 20.0);
        System.out.println("მანქანის ფასი: " + car.calculatePrice());


        Dolly dolly = new Dolly("Barbie Doll", 15.0, 10.0, 5.0);
        System.out.println("თოჯინას ფასი: " + dolly.calculatePrice());
//4)
        FixedSalaryEmployee fixedEmployee = new FixedSalaryEmployee("გიორგი", "ჯუღელი", "555-123456", 2000.0);
        System.out.println("ფიქსირებული ხელფასის მქონე თანამშრომლის მონაცემები:");
        fixedEmployee.printDetails();
        System.out.println("ხელფასი: " + fixedEmployee.calculateSalary());

        System.out.println();


        HourlySalaryEmployee hourlyEmployee = new HourlySalaryEmployee("ანა", "მამუკაშვილი", "555-654321", 20, 100.0);
        System.out.println("დღიური ხელფასის მქონე თანამშრომლის მონაცემები:");
        hourlyEmployee.printDetails();
        System.out.println("ხელფასი: " + hourlyEmployee.calculateSalary());

//5)
        Vehicle myVehicle = new Vehicle();


        myVehicle.startEngine();
        myVehicle.turnLeft();
        myVehicle.turnRight();
        myVehicle.stopEngine();

    }
}
