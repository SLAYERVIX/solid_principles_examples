package single_responsibility.violation;

// This class violate single responsibility Principle "SRP"
// We have 3 methods that do different things, and we must split them to follow SRP
public class Invoice {

    // Calculate invoice total
    void calculateTotal() {
        System.out.println("Total calculated");
    }

    // Print Invoice
    void printInvoice() {
        System.out.println("Invoice");
    }

    // Save Invoice to database
    void saveToDatabase() {
        System.out.println("Invoice Saved");
    }
}
