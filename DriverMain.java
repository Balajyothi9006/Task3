import java.util.Scanner;
//Class DriverMain
public class DriverMain  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept Employee information
        System.out.println("Enter Employee Details:");
        System.out.print("Employee ID: ");
        int empID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Monthly Salary: ");
        double salary = scanner.nextDouble();

        // Create Employee object and display income tax
        Employee employee = new Employee(empID, name, salary) {
            @Override
            public double calculateSalesTax(double unitPrice) {
                return 0;
            }
        };
        employee.displayIncomeTax();

        // Accept Product information
        System.out.println("Enter Product Details:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Total price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        // Create Product object and display sales tax
        Product product = new Product(pid, price, quantity) {
            @Override
            public double calculateIncomeTax(double yearlySalary) {
                return 0;
            }
        };
        product.displaySalesTax();


    }
}
