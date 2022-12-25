package open_closed.violation;

// This class violate Open closed principle because we have to reasons to modify this class
// since it have two functions of saving the invoice one to database and the second to local file
public class InvoicePersistence {
    void saveToFile() {
        System.out.println("Saved to File");
    }

    void saveToDatabase() {
        System.out.println("Saved to Database");
    }
}
