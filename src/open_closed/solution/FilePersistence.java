package open_closed.solution;

public class FilePersistence implements InvoicePersistence{
    @Override
    public void save() {
        System.out.println("Saved to file");
    }
}
