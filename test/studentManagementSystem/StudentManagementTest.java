package studentManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentManagementTest {

    Student student;

    @BeforeEach
    public void setUp() {
        student = new Student("Tayo", "1234");
    }

    @Test
    public void testThatStudentStartsWithNoCourses() {
        assertEquals(0, student.getCourses().size());
    }

    @Test
    public void testThatStudentCanEnrollForA_course() {
        assertEquals(0, student.getCourses().size());

        Course course = new Course("CSC101");
        student.enroll(course);
        assertEquals(1, student.getCourses().size());
    }

    @Test
    public void testThatStudentCanEnrollForMultipleCourses() {
        assertEquals(0, student.getCourses().size());

        Course courseOne = new Course("CSC101");
        student.enroll(courseOne);
        Course courseTwo = new Course("CSC112");
        student.enroll(courseTwo);
        Course courseThree = new Course("CSC121");
        student.enroll(courseThree);
        assertEquals(3, student.getCourses().size());
    }

    @Test
    public void testThatGradesCanBeAssignedToStudent() {
        assertEquals(0, student.getCourses().size());

        Course course = new Course("CSC101");
        student.enroll(course);
        student.assignGrade("CSC101", 70);

        assertEquals(70, course.getGrade());
    }

    @Test
    public void testThatGradeIsAssignedToCorrectCourseOnly() {
        assertEquals(0, student.getCourses().size());

        Course courseOne = new Course("CSC101");
        Course courseTwo = new Course("CSC112");

        student.enroll(courseOne);
        student.enroll(courseTwo);

        student.assignGrade("CSC112", 85);

        assertNull(courseOne.getGrade());
        assertEquals(85, courseTwo.getGrade());
    }

    @Test
    public void testThatGradeCanBeUpdated() {
        assertEquals(0, student.getCourses().size());

        Course course = new Course("CSC101");
        student.enroll(course);

        student.assignGrade("CSC101", 60);
        student.assignGrade("CSC101", 80);

        assertEquals(80, course.getGrade());
    }

    @Test
    public void testThatMinimumGradeIsAccepted() {
        assertEquals(0, student.getCourses().size());

        Course course = new Course("CSC101");
        student.enroll(course);

        student.assignGrade("CSC101", 0);

        assertEquals(0, course.getGrade());
    }

    @Test
    public void testThatMaximumGradeIsAccepted() {
        assertEquals(0, student.getCourses().size());

        Course course = new Course("CSC101");
        student.enroll(course);

        student.assignGrade("CSC101", 100);

        assertEquals(100, course.getGrade());
    }

    @Test
    public void testThatStudentsHaveIndependentCourseLists() {
        assertEquals(0, student.getCourses().size());

        Student studentTwo = new Student("Bola", "5678");
        studentTwo.enroll(new Course("CSC101"));

        assertEquals(0, student.getCourses().size());
        assertEquals(1, studentTwo.getCourses().size());
    }
}
