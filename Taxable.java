public interface Taxable {

        double salesTax = 7.0;
        double incomeTax = 10.5;

        // Methods to calculate taxes
        double calculateIncomeTax(double yearlySalary);
        double calculateSalesTax(double unitPrice);
}
