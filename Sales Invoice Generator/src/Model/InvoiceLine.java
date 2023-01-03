package Model;

public class InvoiceLine {
    String invoiceNumber;
    String itemName;
     int itemPrice;
    int count;

    public InvoiceLine(String invoiceNumber, String itemName, int itemPrice, int count) {
        this.invoiceNumber = invoiceNumber;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }
}
