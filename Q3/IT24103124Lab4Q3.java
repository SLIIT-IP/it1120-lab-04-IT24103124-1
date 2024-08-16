import java.util.Scanner;

public class IT24103124Lab4Q3{
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        //Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        input.close();
    }
}
