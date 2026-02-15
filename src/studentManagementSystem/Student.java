package studentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String id;
    private List<Course> courses;

    public Student(String name, String id) {
        invalidInput(name, id);
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void assignGrade(String courseCode, double grade) {
        for (Course course : courses) {
            if (course.getCode().equals(courseCode)) {
                course.setGrade(grade);
                return;
            }
        }
        throw new IllegalArgumentException("Course not found");
    }

    private void invalidInput(String name, String id) {
        if (name == null || id == null) {
            throw new IllegalArgumentException(("Invalid input"));
        }
    }
}
