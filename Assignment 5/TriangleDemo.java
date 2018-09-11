public class TriangleDemo
{
   public static void main(String[] args)
   {
      Triangle aTriangle = new Triangle(4, 4, 4);
      Triangle bTriangle = new Triangle(3, 2, 4);
      
      System.out.println("Equal(?): "+aTriangle.equals(aTriangle, bTriangle));
      
      aTriangle.triangleShape();
      aTriangle.triangleDefinitions();
      System.out.println(aTriangle.toString());
      
      bTriangle.triangleShape();
      bTriangle.triangleDefinitions();
      System.out.println(bTriangle.toString());
      
   }
}