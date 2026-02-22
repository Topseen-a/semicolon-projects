package studentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManagementSystem system = new StudentManagementSystem();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("=== Student Management System ===");
            System.out.println("1 -> Register Student");
            System.out.println("2 -> Add Course");
            System.out.println("3 -> Enroll Student");
            System.out.println("4 -> Assign Grade");
            System.out.println("5 -> View Student Details");
            System.out.println("6 -> Exit");

            System.out.print("Enter choice: ");
            String choice = input.nextLine();

            switch (choice) {

                case "1":
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();
                    int id = system.registerStudent(name);
                    System.out.println("Student registered with ID: " + id);
                    break;

                case "2":
                    System.out.print("Enter course code: ");
                    String code = input.nextLine();
                    System.out.print("Enter course title: ");
                    String title = input.nextLine();
                    system.addCourse(code, title);
                    System.out.println("Course added successfully.");
                    break;

                case "3":
                    System.out.print("Enter student ID: ");
                    int studentId = Integer.parseInt(input.nextLine());
                    System.out.print("Enter course code: ");
                    String courseCode = input.nextLine();
                    system.enrollStudent(studentId, courseCode);
                    System.out.println("Enrollment successful.");
                    break;

                case "4":
                    System.out.print("Enter student ID: ");
                    studentId = Integer.parseInt(input.nextLine());
                    System.out.print("Enter course code: ");
                    courseCode = input.nextLine();
                    System.out.print("Enter grade: ");
                    double grade = Double.parseDouble(input.nextLine());
                    system.assignGrade(studentId, courseCode, grade);
                    System.out.println("Grade assigned successfully.");
                    break;

                case "5":
                    System.out.print("Enter student ID: ");
                    studentId = Integer.parseInt(input.nextLine());
                    Student student = system.getStudent(studentId);

                    System.out.println("Name: " + student.getName());
                    System.out.println("ID: " + student.getId());

                    for (Enrollment enrollment : student.getEnrollments()) {
                        System.out.println(enrollment.getCourse().getCode() + " - " + enrollment.getCourse().getTitle() + " | Grade: " + enrollment.getGrade());
                    }
                    break;

                case "6":
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
