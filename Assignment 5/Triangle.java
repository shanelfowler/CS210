public class Triangle
{
   //Define an enumerated type, triangleType, that has the values scalene,
   //isosceles, equilateral, and noTriangle
   public enum triangleType
   {
      SCALENE, ISOSCELES, EQUILATERAL, NOTRIANGLE
   }
   //Three data members representing three sides of the triangle
   private int side1;
   private int side2;
   private int side3;
   private triangleType type;
   //A constructor, which takes three parameters to initialize the data members
   public Triangle(int s1, int s2, int s3)
   {
      side1 = s1;
      side2 = s2;
      side3 = s3;
   }
   //A copy constructor, which accepts an exisiting object of the same class and clones it.
   public Triangle(Triangle obj)
   {
      side1 = obj.side1;
      side2 = obj.side2;
      side3 = obj.side3;
   }
   //Write a method triangleShape, which should return the shape of the triangle
   public triangleType triangleShape()
   {
      if(side1 == side2 && side1 == side3 && (side1 + side2) > side3)
         return type.EQUILATERAL;
      if(side1 != side2 && side1 != side3 && (side1 + side2) > side3)
         return type.SCALENE;
      if(side1 == side2 && side3 < side1 && (side1 + side2) > side3)
         return type.ISOSCELES;
      
     return type.NOTRIANGLE; 
   }
   //Write a triangleDefinitions method which displays the definition of a triangle based
   //on the triangleType
   public void triangleDefinitions()
   {
      switch(triangleShape())
      {
         case SCALENE:
            System.out.println("This triangle is scalene!");
            break;
         case ISOSCELES:
            System.out.println("This triangle is isosceles!");
            break;
         case EQUILATERAL:
            System.out.println("This triangle is equilateral!");
            break;
         default:
            System.out.println("This is not a triangle!");
            break;   
      }
   }
   /**
   Write an equals method, which take a Triangle object as a parameter. It should return true if the
   argument object contains the same data as the calling object, or false otherwise.
   @param Triangle obj
   */
   public boolean equals(Triangle obj1, Triangle obj2)
   {
      if(obj1.side1 == obj2.side1 && obj1.side2 == obj2.side2 && obj1.side3 == obj2.side3)
         return true;
      
     return false;
   }
   //Write a toString method for this class. The method should return a string containing the
   //three sides of the triangle.
   public String toString()
   {
      return "Side A: "+side1+"\nSide B: "+side2+"\nSide C: "+side3+"\n";
   }  
}   

