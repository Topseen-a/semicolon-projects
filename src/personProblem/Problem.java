package personProblem;

public class Problem {
    private String name;
    private String description;
    private ProblemType type;
    private boolean isSolved;

    public Problem(String name, ProblemType type) {
        this.name = name;
        this.description = "";
        this.type = type;
        this.isSolved = false;
    }

    public void solve() {
        isSolved = true;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public String getDetails() {
        return "Problem: " + name + "Type: " + type;
    }
}
