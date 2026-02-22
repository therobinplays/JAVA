package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    public static void main(String[] args) {

        List<Student> studentRoster = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        boolean choice = true;

        while (choice) {

            System.out.println("Enter the name:");
            String name = input.nextLine();

            System.out.println("Enter the grade:");
            int grade = input.nextInt();

            input.nextLine(); 

            studentRoster.add(new Student(name, grade));

            System.out.println("Do you want to continue adding? (y/n)");
            char c = input.next().charAt(0);

            input.nextLine(); 

            if (c == 'n' || c == 'N') {
                choice = false;
            }
        }

        System.out.println("\nCurrent Roster:");

        for (Student student : studentRoster) {
            System.out.println(student);
        }

        if (!studentRoster.isEmpty()) {

            Student firstStudent = studentRoster.get(0);

            System.out.println("\nFirst student's name: "
                    + firstStudent.getName());
        }

        input.close();
    }
}