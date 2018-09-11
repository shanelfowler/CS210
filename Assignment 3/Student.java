/**
Define a class Student. Each student is defined by:
   * a string name
   * a floating-point GPA
*/

import java.util.*;
import java.text.DecimalFormat;
   
public class Student
{
   private String name;
   private double GPA;
   
   //to enter the data for a new student
   public Student()
   {
      Scanner keyboard = new Scanner(System.in);
      
      name = keyboard.nextLine();
      GPA = keyboard.nextDouble();
   }
   
   //to retrieve a student's data
   public String getName()
   {
      return name;
   }
   
   public double getGPA()
   {
      return GPA;
   }
   
   //to change data for a student
   public void changeName(String s)
   {
      name = s;
   }
   
   public void changeGPA(double g)
   {
      GPA = g;
   }
   
   //to display a student's information
   public void displayStudentInfo()
   {
      System.out.print("Name: "+name+"\t"+"GPA: "+GPA);
      System.out.println();
   }
   
}