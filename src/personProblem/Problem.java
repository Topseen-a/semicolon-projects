package personProblem;

public class Problem {
    private String name;
    private String description;
    private ProblemType type;
    private boolean isSolved;

    public Problem(String name, String description, ProblemType type) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.isSolved = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ProblemType getType() {
        return type;
    }

    public void setSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    public boolean isSolved() {
        return isSolved;
    }
}
