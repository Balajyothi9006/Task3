//class Employee
public abstract class Employee implements Taxable {

    private int empID;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    // Implementation of calculateIncomeTax
    @Override
    public double calculateIncomeTax(double yearlySalary) {
        return yearlySalary * (incomeTax / 100);
    }

    // Method to calculate and display income tax
    public void displayIncomeTax() {
        double yearlySalary = salary * 12; // Convert monthly salary to yearly salary
        double incomeTax = calculateIncomeTax(yearlySalary);
        System.out.println("Yearly income Tax for Employee " + name + " with empID: " + empID + " is " + incomeTax);
    }
}
