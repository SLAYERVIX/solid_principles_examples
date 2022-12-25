package interface_segregation.violation;
// This class is forced to implements detailed invoice function while it's not needed
public class SimpleInvoice implements InvoicePrinter {
    @Override
    public void simpleInvoice() {
        System.out.println("Simple Invoice");
    }

    @Override
    public void detailedInvoice() {}
}
