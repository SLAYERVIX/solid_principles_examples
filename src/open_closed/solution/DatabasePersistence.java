package open_closed.solution;

public class DatabasePersistence implements InvoicePersistence{
    @Override
    public void save() {
        System.out.println("Saved to database");
    }
}
