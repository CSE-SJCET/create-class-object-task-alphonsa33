class Student {
    String name;
    int rollNumber;
    char grade;

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "alph";
        student.rollNumber = 13;
        student.grade = 'A';
        student.displayDetails();
    }
}

