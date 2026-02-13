package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
         Invoice inv = new Invoice("B2", "Laptop", 1, 1999.9);
          
        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price Per Item: " + inv.getPricePerItem());
    }
}
