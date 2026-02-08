import java.util.Scanner ;
public class Value {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        String a[] = new String [10];
        System.out.println("Enter the name of 10 stds");

        for (int i = 0; i < 10; i++) {

            a[i] = scan.nextLine();

        }

        for (int i = 0; i < 10; i++) {

            System.out.println("The names are :" + a[i]);
            
        }

    }

}