package studentManagementSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CourseTest {

    @Test
    public void testThatCourseCanBeCreated() {
        Course course = new Course("CS101", "Intro to CS");

        assertEquals("CS101", course.getCode());
        assertEquals("Intro to CS", course.getTitle());
    }

    @Test
    public void testThatInvalidCourseDataRaisesException() {
        assertThrows(IllegalArgumentException.class, () -> {new Course("", "Intro");});
        assertThrows(IllegalArgumentException.class, () -> {new Course("CS101", "");});
    }
}
