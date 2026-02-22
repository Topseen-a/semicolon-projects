package studentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int id;
    private List<Enrollment> enrollments;

    public Student(String name, int id) {
        validateName(name);
        this.name = name;
        this.id = id;
        this.enrollments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void updateName(String newName) {
        validateName(newName);
        this.name = newName;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public List<Enrollment> getEnrollments() {
        return new ArrayList<>(enrollments);
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
    }
}
