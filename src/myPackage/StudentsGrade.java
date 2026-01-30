package myPackage;

import java.util.Scanner;
public class StudentsGrade{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("How many student do you have? ");
        int studentCount = input.nextInt();

        System.out.print("How many subjects do they offer? ");
        int subjectCount = input.nextInt();

        System.out.println("\nSaving >>>>>>>>>>>>>>>>>>");
        System.out.println("Saved succesfully");

        int[][] studentScores = new int[studentCount][subjectCount];

        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++){
            System.out.println("\nEntering score for student " + (studentIndex + 1));

            for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++){
                System.out.print("Enter score for subject " + (subjectIndex + 1) + ": ");
                int score = input.nextInt();

                while (score < 0 || score > 100){
                    System.out.print("Invalid score, enter a score between 0 - 100: ");
                    score = input.nextInt();
                }

                studentScores[studentIndex][subjectIndex] = score;
            }
        }

        System.out.println("==================================================================");
        System.out.printf("%-10s", "STUDENTS");

        for (int subjectIndex = 1; subjectIndex <= subjectCount; subjectIndex++){
            System.out.printf("%10s", "SUB" + subjectIndex);
        }

        System.out.printf("%10s%10s%10s%n", "TOT", "AVE", "POS");
        System.out.println("==================================================================");

        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++){
            System.out.printf("%-10s", "Student" + (studentIndex + 1));

            for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++){
                System.out.printf("%10d", studentScores[studentIndex][subjectIndex]);
            }

            System.out.printf("%10d", totalScoresPerStudent(studentScores)[studentIndex]);

            System.out.printf("%10d", averageScoresPerStudent(studentScores)[studentIndex]);

            System.out.printf("%10d", studentPositions(studentScores)[studentIndex]);
            System.out.println();
        }

        System.out.println("\nSUBJECT SUMMARY");
        System.out.println("==================================================================");

        for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++){
            System.out.println("Subject " + (subjectIndex + 1));

            System.out.println("Highest Scoring student is: Student " + highestScoringStudentInSubject(studentScores)[subjectIndex] + " scoring " + highestScoreInSubject(studentScores)[subjectIndex]);

            System.out.println("Lowest Scoring student is: Student " + lowestScoringStudentInSubject(studentScores)[subjectIndex] + " scoring " + lowestScoreInSubject(studentScores)[subjectIndex]);

            System.out.println("Total Score is: " + totalScoresPerSubject(studentScores)[subjectIndex]);

            System.out.println("Average Score is: " + averageScoresPerSubject(studentScores)[subjectIndex]);

            System.out.println("Number of Passes: "+ passPerSubject(studentScores)[subjectIndex]);

            System.out.println("Number of Fails: " + failPerSubject(studentScores)[subjectIndex]);
            System.out.println();
        }

        System.out.println("The hardest subject is subject " + hardestSubject(studentScores) + " with " + hardestSubjectFailures(studentScores) + " failures");

        System.out.println("The easiest subject is subject " + easiestSubject(studentScores) + " with " + easiestSubjectPasses(studentScores) + " passes");

        System.out.println("The overall highest score is scored by student " + overallHighestScoringStudent(studentScores) + " in subject " + overallHighestScoredSubject(studentScores) + " scoring " + overallHighestScore(studentScores));

        System.out.println("The overall lowest score is scored by student " + overallLowestScoringStudent(studentScores) + " in subject " + overallLowestScoredSubject(studentScores) + " scoring " + overallLowestScore(studentScores));

        System.out.println("\n==================================================================");
        System.out.println("CLASS SUMMARY");
        System.out.println("==================================================================");

        System.out.println("Best Graduating Student is: Student " + bestGraduatingStudent(studentScores) + " scoring " + bestGraduatingStudentScore(studentScores));

        System.out.println("Worst Graduating Student is: Student " + worstGraduatingStudent(studentScores) + " scoring " + worstGraduatingStudentScore(studentScores));

        System.out.println("Class Total Score : " + classTotalScores(studentScores));
        System.out.println("Class Average Score : " + classAverageScore(studentScores));
        System.out.println("==================================================================");
    }

    public static int[] totalScoresPerStudent(int[][] array){
        int[] totalScoresPerStudent = new int[array.length];
        for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
            for (int subjectIndex = 0; subjectIndex < array[studentIndex].length; subjectIndex++){
                totalScoresPerStudent[studentIndex] += array[studentIndex][subjectIndex];
            }
        }
        return totalScoresPerStudent;
    }

    public static int[] averageScoresPerStudent(int[][] array){
        int[] totalScoresPerStudent = totalScoresPerStudent(array);
        int[] averageScoresPerStudent = new int[array.length];
        for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
            averageScoresPerStudent[studentIndex] = totalScoresPerStudent[studentIndex] / array[studentIndex].length;
        }
        return averageScoresPerStudent;
    }

    public static int[] studentPositions(int[][] array){
        int[] totalScoresPerStudent = totalScoresPerStudent(array);
        int[] studentPositions = new int[array.length];

        for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
            int position = 1;
            for (int otherStudentIndex = 0; otherStudentIndex < array.length; otherStudentIndex++){
                if (totalScoresPerStudent[otherStudentIndex] > totalScoresPerStudent[studentIndex]){
                    position++;
                }
            }
            studentPositions[studentIndex] = position;
        }
        return studentPositions;
    }

    public static int[] passPerSubject(int[][] array){
        int[] passPerSubject = new int[array[0].length];
        for (int subjectIndex = 0; subjectIndex < array[0].length; subjectIndex++){
            for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
                if (array[studentIndex][subjectIndex] >= 50){
                    passPerSubject[subjectIndex]++;
                }
            }
        }
        return passPerSubject;
    }

    public static int[] failPerSubject(int[][] array){
        int[] failPerSubject = new int[array[0].length];
        int[] passPerSubject = passPerSubject(array);
        for (int subjectIndex = 0; subjectIndex < array[0].length; subjectIndex++){
            failPerSubject[subjectIndex] = array.length - passPerSubject[subjectIndex];
        }
        return failPerSubject;
    }

    public static int[] highestScoreInSubject(int[][] array){
        int[] highestScoreInSubject = new int[array[0].length];
        for (int subjectIndex = 0; subjectIndex < array[0].length; subjectIndex++){
            int highestScore = array[0][subjectIndex];
            for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
                if (array[studentIndex][subjectIndex] > highestScore){
                    highestScore = array[studentIndex][subjectIndex];
                }
            }
            highestScoreInSubject[subjectIndex] = highestScore;
        }
        return highestScoreInSubject;
    }

    public static int[] highestScoringStudentInSubject(int[][] array){
        int[] highestScoreInSubject = highestScoreInSubject(array);
        int[] highestScoringStudentInSubject = new int[array[0].length];
        for (int subjectIndex = 0; subjectIndex < array[0].length; subjectIndex++){
            for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
                if (array[studentIndex][subjectIndex] == highestScoreInSubject[subjectIndex]){
                    highestScoringStudentInSubject[subjectIndex] = studentIndex + 1;
                }
            }
        }
        return highestScoringStudentInSubject;
    }

    public static int[] lowestScoreInSubject(int[][] array){
        int[] lowestScoreInSubject = new int[array[0].length];
        for (int subjectIndex = 0; subjectIndex < array[0].length; subjectIndex++){
            int lowestScore = array[0][subjectIndex];
            for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
                if (array[studentIndex][subjectIndex] < lowestScore){
                    lowestScore = array[studentIndex][subjectIndex];
                }
            }
            lowestScoreInSubject[subjectIndex] = lowestScore;
        }
        return lowestScoreInSubject;
    }

    public static int[] lowestScoringStudentInSubject(int[][] array){
        int[] lowestScoreInSubject = lowestScoreInSubject(array);
        int[] lowestScoringStudentInSubject = new int[array[0].length];
        for (int subjectIndex = 0; subjectIndex < array[0].length; subjectIndex++){
            for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
                if (array[studentIndex][subjectIndex] == lowestScoreInSubject[subjectIndex]){
                    lowestScoringStudentInSubject[subjectIndex] = studentIndex + 1;
                }
            }
        }
        return lowestScoringStudentInSubject;
    }

    public static int[] totalScoresPerSubject(int[][] array){
        int[] totalScoresPerSubject = new int[array[0].length];
        for (int subjectIndex = 0; subjectIndex < array[0].length; subjectIndex++){
            int total = 0;
            for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
                total += array[studentIndex][subjectIndex];
            }
            totalScoresPerSubject[subjectIndex] = total;
        }
        return totalScoresPerSubject;
    }

    public static double[] averageScoresPerSubject(int[][] array){
        int[] totalScoresPerSubject = totalScoresPerSubject(array);
        double[] averageScoresPerSubject = new double[array[0].length];
        for (int subjectIndex = 0; subjectIndex < array[0].length; subjectIndex++){
            averageScoresPerSubject[subjectIndex] = totalScoresPerSubject[subjectIndex] / array.length;
        }
        return averageScoresPerSubject;
    }

    public static int overallHighestScore(int[][] array){
        int highestScore = array[0][0];
        for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
            for (int subjectIndex = 0; subjectIndex < array[studentIndex].length; subjectIndex++){
                if (array[studentIndex][subjectIndex] > highestScore){
                    highestScore = array[studentIndex][subjectIndex];
                }
            }
        }
        return highestScore;
    }

    public static int overallHighestScoredSubject(int[][] array){
        int score = overallHighestScore(array);
        int subject = 0;
        for (int subjectIndex = 0; subjectIndex < array[0].length; subjectIndex++){
            for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
                if (array[studentIndex][subjectIndex] == score){
                    subject = subjectIndex + 1;
                }
            }
        }
        return subject;
    }

    public static int overallHighestScoringStudent(int[][] array){
        int score = overallHighestScore(array);
        int subjectIndex = overallHighestScoredSubject(array) - 1;
        int student = 0;
        for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
            if (array[studentIndex][subjectIndex] == score){
                student = studentIndex + 1;
            }
        }
        return student;
    }

    public static int overallLowestScore(int[][] array){
        int lowestScore = array[0][0];
        for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
            for (int subjectIndex = 0; subjectIndex < array[studentIndex].length; subjectIndex++){
                if (array[studentIndex][subjectIndex] < lowestScore){
                    lowestScore = array[studentIndex][subjectIndex];
                }
            }
        }
        return lowestScore;
    }

    public static int overallLowestScoredSubject(int[][] array){
        int score = overallLowestScore(array);
        int subject = 0;
        for (int subjectIndex = 0; subjectIndex < array[0].length; subjectIndex++){
            for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
                if (array[studentIndex][subjectIndex] == score){
                    subject = subjectIndex + 1;
                }
            }
        }
        return subject;
    }

    public static int overallLowestScoringStudent(int[][] array){
        int score = overallLowestScore(array);
        int subjectIndex = overallLowestScoredSubject(array) - 1;
        int student = 0;
        for (int studentIndex = 0; studentIndex < array.length; studentIndex++){
            if (array[studentIndex][subjectIndex] == score){
                student = studentIndex + 1;
            }
        }
        return student;
    }

    public static int hardestSubject(int[][] array){
        int[] failPerSubject = failPerSubject(array);
        int hardestSubjectIndex = 0;
        for (int subjectIndex = 1; subjectIndex < failPerSubject.length; subjectIndex++){
            if (failPerSubject[subjectIndex] > failPerSubject[hardestSubjectIndex]){
                hardestSubjectIndex = subjectIndex;
            }
        }
        return hardestSubjectIndex + 1;
    }

    public static int hardestSubjectFailures(int[][] array){
        return failPerSubject(array)[hardestSubject(array) - 1];
    }

    public static int easiestSubject(int[][] array){
        int[] passPerSubject = passPerSubject(array);
        int easiestSubjectIndex = 0;
        for (int subjectIndex = 1; subjectIndex < passPerSubject.length; subjectIndex++){
            if (passPerSubject[subjectIndex] > passPerSubject[easiestSubjectIndex]){
                easiestSubjectIndex = subjectIndex;
            }
        }
        return easiestSubjectIndex + 1;
    }

    public static int easiestSubjectPasses(int[][] array){
        return passPerSubject(array)[easiestSubject(array) - 1];
    }

    public static int bestGraduatingStudent(int[][] array){
        int[] totalScoresPerStudent = totalScoresPerStudent(array);
        int bestGraduatingStudentIndex = 0;
        for (int studentIndex = 1; studentIndex < totalScoresPerStudent.length; studentIndex++){
            if (totalScoresPerStudent[studentIndex] > totalScoresPerStudent[bestGraduatingStudentIndex]){
                bestGraduatingStudentIndex = studentIndex;
            }
        }
        return bestGraduatingStudentIndex + 1;
    }

    public static int bestGraduatingStudentScore(int[][] array){
        return totalScoresPerStudent(array)[bestGraduatingStudent(array) - 1];
    }

    public static int worstGraduatingStudent(int[][] array){
        int[] totalScoresPerStudent = totalScoresPerStudent(array);
        int worstGraduatingStudentIndex = 0;
        for (int studentIndex = 1; studentIndex < totalScoresPerStudent.length; studentIndex++){
            if (totalScoresPerStudent[studentIndex] < totalScoresPerStudent[worstGraduatingStudentIndex]){
                worstGraduatingStudentIndex = studentIndex;
            }
        }
        return worstGraduatingStudentIndex + 1;
    }

    public static int worstGraduatingStudentScore(int[][] array){
        return totalScoresPerStudent(array)[worstGraduatingStudent(array) - 1];
    }

    public static int classTotalScores(int[][] array){
        int classTotalScores = 0;
        int[] totalScoresPerStudent = totalScoresPerStudent(array);
        for (int studentIndex = 0; studentIndex < totalScoresPerStudent.length; studentIndex++){
            classTotalScores += totalScoresPerStudent[studentIndex];
        }
        return classTotalScores;
    }

    public static double classAverageScore(int[][] array){
        return classTotalScores(array) / array.length;
    }
}

