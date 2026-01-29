import java.io.*;
import java.util.Scanner;

public class Filehandaling{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = "abc.txt";

        try {
            // -------- WRITING TO FILE --------
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            System.out.print("How many students to add? ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter name of student " + i + ": ");
                String name = sc.nextLine();
                writer.write(name);
                writer.newLine(); // move to next line
            }

            writer.close();
            System.out.println("\nData saved to file successfully!");

            // -------- READING FROM FILE --------
            System.out.println("\nReading data from file:");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Student: " + line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error handling file.");
            e.printStackTrace();
        }

        sc.close();
    }
}