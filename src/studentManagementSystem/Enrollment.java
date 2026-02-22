package studentManagementSystem;

public class Enrollment {

    private Course course;
    private Double grade;

    public Enrollment(Course course) {
        this.course = course;
        this.grade = null;
    }

    public Course getCourse() {
        return course;
    }

    public void setGrade(double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Invalid grade");
        }
        this.grade = grade;
    }

    public Double getGrade() {
        return grade;
    }
}
