public class RetailItem
{
   private String description;
   private int unitsOnHand;
   private double price;
   
   //A constructor that accepts arguments for each field
   //@params String d (description), int u (unitsOnHand), double p (price)
   public RetailItem(String d, int u, double p)
   {
      description = d;
      unitsOnHand = u;
      price = p;
   }
   //Appropriate accessors
   public String getDesc()
   {
      return description;
   }
   public int getOnHand()
   {
      return unitsOnHand;
   }
   public double getPrice()
   {
      return price;
   } 
   //Appropriate mutators
   public void setDesc(String d)
   {
      description = d;
   }
   public void setOnHand(int h)
   {
      unitsOnHand = h;
   }
   public void setPrice(double p)
   {
      price = p;
   }
}