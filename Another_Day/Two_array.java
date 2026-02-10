
import java.util.Scanner;

public class Two_array {
    public static void main(String[] args) {
        int[][] numbers = new int[3][5];

        Scanner scan = new Scanner (System.in);

        System.err.println("Enter the number in rows and column.");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <5 ; j++) {
                numbers [i][j] =scan.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; i < 5; j++) {   
                System.out.print(numbers[i][j]);
            }
            System.out.println(); 
        }
    }
}