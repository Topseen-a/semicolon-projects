package studentManagementSystem;

public class Course {

    private String code;
    private Double grade;

    public Course(String code) {
        this.code = code;
    }

    public void setGrade(Double grade) {
        isValidGrade(grade);
        this.grade = grade;
    }

    public Double getGrade() {
        return grade;
    }

    public String getCode() {
        return code;
    }

    private void isValidGrade(Double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Invalid grade entered");
        }
    }
}
