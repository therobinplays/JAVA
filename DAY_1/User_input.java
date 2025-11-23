import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = scan.nextInt();

        System.out.println("You entered: " + number1);

        scan.close();
    }
}
