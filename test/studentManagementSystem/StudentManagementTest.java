package studentManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentManagementTest {

    private StudentManagementSystem system;

    @BeforeEach
    public void setUp() {
        system = new StudentManagementSystem();
    }

    @Test
    public void testThatStudentManagementCanRegisterStudent() {
        int studentId = system.registerStudent("Tayo");
        assertEquals(1, studentId);
    }

    @Test
    public void testThatRegisterInvalidStudentRaisesError() {
        assertThrows(IllegalArgumentException.class, () -> {system.registerStudent("");});
    }

    @Test
    public void testThatGetNonexistentStudentRaisesError() {
        assertThrows(IllegalArgumentException.class, () -> {system.getStudent(999);});
    }

    @Test
    public void testStudentManagementCanAddCourse() {
        system.addCourse("CS101", "Intro");
        Course course = system.getCourse("CS101");
        assertEquals("Intro", course.getTitle());
    }

    @Test
    public void testThatDuplicateCourseRaisesException() {
        system.addCourse("CS101", "Intro");

        assertThrows(IllegalArgumentException.class, () -> {system.addCourse("CS101", "Intro");});
    }

    @Test
    public void testFullWorkflow() {
        int studentId = system.registerStudent("Tayo");
        system.addCourse("CS101", "Intro");

        system.enrollStudent(studentId, "CS101");
        system.assignGrade(studentId, "CS101", 88);

        Student student = system.getStudent(studentId);
        Enrollment enrollment = student.getEnrollments().get(0);

        assertEquals(88, enrollment.getGrade());
    }

    @Test
    public void testThatDuplicateEnrollmentRaisesException() {
        int studentId = system.registerStudent("Tayo");
        system.addCourse("CS101", "Intro");

        system.enrollStudent(studentId, "CS101");

        assertThrows(IllegalArgumentException.class, () -> {system.enrollStudent(studentId, "CS101");});
    }

    @Test
    public void testAssignGradeWhenStudentIsNotEnrolled() {
        int studentId = system.registerStudent("Tayo");
        system.addCourse("CS101", "Intro");

        assertThrows(IllegalArgumentException.class, () -> {system.assignGrade(studentId, "CS101", 90);});
    }
}
