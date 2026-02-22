package studentManagementSystem;

public class Course {

    private String code;
    private String title;

    public Course(String code, String title) {
        validateData(code, title);
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    private void validateData(String code, String title) {
        if (code == null || code.isBlank() || title == null || title.isBlank()) {
            throw new IllegalArgumentException("Invalid course data");
        }
    }
}
