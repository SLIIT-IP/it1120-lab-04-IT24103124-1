import java.util.Scanner;

public class IT24103124Lab4Q3{
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);  
        

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
    
        // Ternary operator version
        String result = (number > 0) ? "The number is Positive."
                     : (number < 0) ? "The number is Negative."
                     : "The number is Zero.";
        
                System.out.println(result);
        
                input.close();
    }
}
