public class CashRegister
{
   private final double tax = 0.06;
   private int quantity;
   private double price;
   //A constructor that accepts a RetailItem object as an argument.
   //@param RetailItem obj, int n (quantity of items being purchased)
   public CashRegister(RetailItem obj, int q)
   {
      price = obj.getPrice();
      quantity = q;
   }
   /**
   The getSubtotal method should return the subtotal of the sale, which is the
   the quantity multipled by the price. This method must get the price from the
   RetailItem object that was passed as an argument in the constructor.
   */
   public double getSubtotal()
   {
      return quantity * price;
   }
   /**
   The getTax method should return the amount of sales tax on the purchase. The
   sales tax rate is 6 percent of a retail sale.
   */
   public double getTax()
   {
      return price * tax;
   }
   /**
   The getTotal method should return the total of the sale, which is the subtotal
   plus the sales tax.
   */
   public double getTotal()
   {
      return (getSubtotal() + getTax()); 
   }
   
}