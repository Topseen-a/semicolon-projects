package personProblem;

public class Person {
    private String name;
    private Problem[] problems;
    private int count;

    public Person(String name) {
        this.name = name;
        problems = new Problem[10];
        count = 0;
    }

    public void addProblem(Problem problem) {
        if (count < problems.length) {
            problems[count] = problem;
            count++;
        }
    }

    public void solveProblem(int index) {
        if (index >= 0 && index < count) {
            problems[index].solve();
        }
    }
}
