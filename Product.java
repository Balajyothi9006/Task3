//Class Product
public abstract class Product implements Taxable {

    private int pid;
    private double price;
    private int quantity;

    // Constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
//implementation of calculateSalesTax
    @Override
    public double calculateSalesTax(double unitPrice) {
        return unitPrice * (salesTax / 100);
    }

    // Method to calculate and display sales tax
    public void displaySalesTax() {
        double unitprice = price/quantity;
        double salesTax = calculateSalesTax(unitprice);
        System.out.println("Sales Tax for Product ID " + pid + " " + salesTax + " per unit.");
    }
}

