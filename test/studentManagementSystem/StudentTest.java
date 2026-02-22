package studentManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student("Tayo", 1);
    }

    @Test
    public void testThatStudentCanBeCreated() {
        assertEquals("Tayo", student.getName());
        assertEquals(1, student.getId());
    }

    @Test
    public void testThatInvalidNameRaisesException() {
        assertThrows(IllegalArgumentException.class, () -> {new Student("", 1);});
    }

    @Test
    public void testThatNameCanBeUpdated() {
        student.updateName("Bola");
        assertEquals("Bola", student.getName());
    }

    @Test
    public void testThatInvalidUpdateNameRaisesException() {
        assertThrows(IllegalArgumentException.class, () -> {student.updateName("");});
    }

    @Test
    public void testAddEnrollment() {
        Course course = new Course("CS101", "Intro");
        Enrollment enrollment = new Enrollment(course);

        student.addEnrollment(enrollment);

        assertEquals(1, student.getEnrollments().size());
    }

    @Test
    public void testThatGetEnrollmentsReturnsCopy() {
        Course course = new Course("CS101", "Intro");
        Enrollment enrollment = new Enrollment(course);

        student.addEnrollment(enrollment);

        List<Enrollment> enrollments = student.getEnrollments();
        enrollments.clear();

        assertEquals(1, student.getEnrollments().size());
    }
}
