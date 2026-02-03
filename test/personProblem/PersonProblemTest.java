package personProblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PersonProblemTest {
    Person person;

    @BeforeEach
    public void setUp() {
        person = new Person("Raymond");
    }

    @Test
    public void testThatPersonStartsWithNoProblem() {
        assertTrue(person.getProblems().isEmpty());
    }

    @Test
    public void testThatAddProblemIncreasesProblemList() {
        assertTrue(person.getProblems().isEmpty());
        Problem problem = new Problem("Books", "Cannot read simple words", ProblemType.EDUCATION);
        person.addProblem(problem);
        assertEquals(1, person.getProblems().size());
    }

    @Test
    public void testThatProblemIsUnsolvedAtInitial() {
        assertTrue(person.getProblems().isEmpty());
        Problem problem = new Problem("Phone", "Broken Screen", ProblemType.TECHNICAL);
        person.addProblem(problem);
        assertFalse(problem.isSolved());
    }

    @Test
    public void testThatSolveProblemIsSolved() {
        assertTrue(person.getProblems().isEmpty());
        Problem problem = new Problem("School", "Cannot pay tuition", ProblemType.FINANCIAL);
        person.addProblem(problem);
        person.solveProblem(0);
        assertTrue(problem.isSolved());
    }

    @Test
    public void testThatGetUnsolvedProblemsOnlyReturnsUnsolvedProblems() {
        assertTrue(person.getProblems().isEmpty());
        Problem problemOne = new Problem("Books", "Cannot read simple words", ProblemType.EDUCATION);
        Problem problemTwo = new Problem("Phone", "Broken Screen", ProblemType.TECHNICAL);
        person.addProblem(problemOne);
        person.addProblem(problemTwo);
        person.solveProblem(0);

        ArrayList<Problem> unsolved = person.getUnsolvedProblems();
        assertEquals(1, unsolved.size());
    }
}
