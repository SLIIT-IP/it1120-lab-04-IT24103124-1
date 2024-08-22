import java.util.Scanner;

public class IT24103124Lab4Q2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

   
      System.out.print("Enter exam marks (0-100): ");
      double examMarks = input.nextDouble();

      if (examMarks < 0 || examMarks > 100) {
         System.out.println("Invalid exam marks. Must be between 0 and 100.");
         return;
      }

      
      System.out.print("Enter lab submission marks (0-100): ");
      double labMarks = input.nextDouble();

      if (labMarks < 0 || labMarks > 100) {
         System.out.println("Invalid lab submission marks. Must be between 0 and 100.");
         return;
      }

      
      System.out.print("Enter percentage for exam marks: ");
      double examPercentage = input.nextDouble();

      if (examPercentage < 0 || examPercentage > 100) {
         System.out.println("Invalid percentage for exam marks. Must be between 0 and 100.");
         return;
      }

  
      System.out.print("Enter percentage for lab submission marks: ");
      double labPercentage = input.nextDouble();

      if (labPercentage < 0 || labPercentage > 100) {
         System.out.println("Invalid percentage for lab submission marks. Must be between 0 and 100.");
         return;
      }

      
      if (examPercentage + labPercentage != 100) {
         System.out.println("The percentages must add up to 100.");
         return;
      }

      
      double finalMark = (examMarks * (examPercentage / 100)) + (labMarks * (labPercentage / 100));
      System.out.println("The final mark is: " + finalMark);

      
   }
}