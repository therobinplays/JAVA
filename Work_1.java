
import java.util.Scanner ;
public class Work_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check it is positive or negative:");
        int number = scanner.nextInt();
        
        if (number > 0)
        {
            System.out.println("The Given Number is a Positive Number.");
        }

        else if (number == 0) {
            System.out.println("The Given Number is Neither Positive or Nor Negative.");
        }

        else{
            System.out.println("The Given Number is a Negative Number.");
        }

        scanner.close();
    }
    
}