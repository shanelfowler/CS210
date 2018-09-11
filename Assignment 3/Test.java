public class Test
{
   //Calculate the average GPA of these students
   public static double averageGPA(Student[] arr)
   {
      double total = 0;
      double average;
      
      for(int i = 0; i < arr.length; i++)
      {
         total += arr[i].getGPA();
      }
      
      average = total / arr.length;
      
      return average;
   }
   
   //Find out the highest GPA and students' names
   public static double highestGPA(Student[] arr)
   {
      double grade = arr[0].getGPA();
      
      for(int i = 1; i < arr.length; i++)
      {
         if(arr[i].getGPA() > grade)
            grade = arr[i].getGPA();
      }
      return grade;
   }
   
   //Display the student ranking based on their GPAs in descending order
   public static void sort(Student[] arr)
   {
     double temp = arr[0].getGPA();
     String temp2 = arr[0].getName();
     
     for(int i = 0; i < arr.length; i++)
     {
         for(int j = 1; j < arr.length; j++)
         {
           if(arr[j-1].getGPA() < arr[j].getGPA())
           {
               temp = arr[j-1].getGPA();
               arr[j-1].changeGPA(arr[j].getGPA());
               arr[j].changeGPA(temp);
               
               temp2 = arr[j-1].getName();
               arr[j-1].changeName(arr[j].getName());
               arr[j].changeName(temp2);
           }
         }
     }
   }
   
   public static void main(String[] args)
   {
      //Create an array of 5 students
      Student[] info = new Student[5];
      
      //Enter data for 5 students
      for(int i = 0; i < info.length; i++)
      {
         System.out.print("Student #"+(i+1)+": ");
         info[i] = new Student();  
      }
      System.out.println();
      
      System.out.println("Average GPA: "+averageGPA(info));
      System.out.println("Highest GPA: "+highestGPA(info)+"\n");
      
      System.out.println("Student Ranking:\n");
      
      sort(info);
      for(int i = 0; i < info.length; i++)
         System.out.println("Name: "+info[i].getName()+"\t\t"+info[i].getGPA());
   }
}