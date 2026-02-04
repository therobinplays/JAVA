import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

        int a[] = new int[5];

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your five numbers:");

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println("You enter these five numbers:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}