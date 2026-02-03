package personProblem;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Problem> problems;

    public Person(String name) {
        this.name = name;
        problems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public void solveProblem(int index) {
        if (index >= 0 && index < problems.size()) {
            problems.get(index).setSolved(true);
        }
    }

    public ArrayList<Problem> getProblems() {
        return problems;
    }

    public ArrayList<Problem> getUnsolvedProblems() {
        ArrayList<Problem> unsolved = new ArrayList<>();

        for (Problem problem : problems) {
            if (!problem.isSolved()) {
                unsolved.add(problem);
            }
        }
        return unsolved;
    }
}
