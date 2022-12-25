package interface_segregation.solution;

public class SimpleInvoice implements ISimpleInvoice {
    @Override
    public void simpleInvoice() {
        System.out.println("Simple Invoice");
    }
}
