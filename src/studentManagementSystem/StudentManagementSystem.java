package studentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {

    private List<Student> students;
    private List<Course> courses;
    private int nextStudentId;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        nextStudentId = 1;
    }

    public int registerStudent(String name) {
        Student student = new Student(name, nextStudentId);
        students.add(student);
        return nextStudentId++;
    }

    public Student getStudent(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student does not exist");
    }

    public void addCourse(String code, String title) {
        for (Course course : courses) {
            if (course.getCode().equals(code)) {
                throw new IllegalArgumentException("Course already exists");
            }
        }

        courses.add(new Course(code, title));
    }

    public Course getCourse(String code) {
        for (Course course : courses) {
            if (course.getCode().equals(code)) {
                return course;
            }
        }
        throw new IllegalArgumentException("Course does not exist");
    }

    public void enrollStudent(int studentId, String courseCode) {
        Student student = getStudent(studentId);
        Course course = getCourse(courseCode);

        for (Enrollment enrollment : student.getEnrollments()) {
            if (enrollment.getCourse().getCode().equals(courseCode)) {
                throw new IllegalArgumentException("Student already enrolled in this course");
            }
        }

        student.addEnrollment(new Enrollment(course));
    }

    public void assignGrade(int studentId, String courseCode, double grade) {
        Student student = getStudent(studentId);

        for (Enrollment enrollment : student.getEnrollments()) {
            if (enrollment.getCourse().getCode().equals(courseCode)) {
                enrollment.setGrade(grade);
                return;
            }
        }

        throw new IllegalArgumentException("Student not enrolled in this course");
    }
}