import java.util.*;

public class SalesReceipt
{
   public static void main(String[] args)
   {
      RetailItem towel = new RetailItem("Towel", 20, 14.25);
      Scanner keyboard = new Scanner(System.in);
      int numPurchase;
      
      System.out.print("How many towels would you like? ");
      numPurchase = keyboard.nextInt();
      
      CashRegister receipt = new CashRegister(towel, numPurchase);
      
      System.out.print("Unit Price: "+towel.getPrice()+"\n"+
                      "Quantity: "+numPurchase+"\n"+
                      "Subtotal: "+receipt.getSubtotal()+"\n"+
                      "Sales Tax: "+receipt.getTax()+"\n");
      System.out.printf("Total: %.2f",receipt.getTotal(),"\n");
   }
}