package studentManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentTest {

    private Course course;
    private Enrollment enrollment;

    @BeforeEach
    public void setUp() {
        course = new Course("CS101", "Intro to CS");
        enrollment = new Enrollment(course);
    }

    @Test
    public void testThatInitialGradeIsNull() {
        assertNull(enrollment.getGrade());
    }

    @Test
    public void testThatSetValidGradeSetsGrade() {
        enrollment.setGrade(90);
        assertEquals(90, enrollment.getGrade());
    }

    @Test
    public void testThatSetInvalidGradeRaisesException() {
        assertThrows(IllegalArgumentException.class, () -> {enrollment.setGrade(-10);});
        assertThrows(IllegalArgumentException.class, () -> {enrollment.setGrade(150);});
    }

    @Test
    public void testThatGetCourseReturnsCourse() {
        assertEquals("CS101", enrollment.getCourse().getCode());
    }
}
