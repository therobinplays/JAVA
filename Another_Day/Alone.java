import java.util.Scanner;

public class Alone {

    public static void main(String[] args) {
        String a[] = new String[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter the name [" + i + "] : ");
            a[i] = scan.nextLine();
            
        }

        for (int i = 0; i < 10; i++) 
        {
            System.out.println("The entered name [" + i + "] is " + a[i]);

        }

        scan.close();
    }
}

