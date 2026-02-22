package arrayList;

public class Student {
    private String name;
    private int grade;
    private int studentId;
    private static int count = 1001; // Used for auto-incrementing ID

    // Constructor to initialize a new Student object
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.studentId = count++; // Assign ID and increment the counter
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getStudentId() {
        return studentId;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Student{ID=" + studentId + ", name='" + name + "', grade=" + grade + '}';
    }
}