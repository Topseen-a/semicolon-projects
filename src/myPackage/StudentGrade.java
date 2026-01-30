package myPackage;

import java.util.Scanner;
public class StudentGrade{
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        System.out.print("How many student do you have? ");
        int studentCount = input.nextInt();

        System.out.print("How many subjects do they offer? ");
        int subjectCount = input.nextInt();

        System.out.println("\nSaving >>>>>>>>>>>>>>>>>>");
        System.out.println("Saved succesfully");

        int[][] studentScores = new int[studentCount][subjectCount];
        int[] totalScoresPerStudent = new int[studentCount];
        int[] averageScoresPerStudent = new int[studentCount];
        int[] studentPositions = new int[studentCount];

        int[] passPerSubject = new int[subjectCount];
        int[] failPerSubject = new int[subjectCount];

        int highestScoreOverall = 0;
        int highestScoreStudent = 0;
        int highestScoreSubject = 0;

        int lowestScoreOverall = 100;
        int lowestScoreStudent = 0;
        int lowestScoreSubject = 0;

        int classTotalScores = 0;
        double classAverageScore;

        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++){
            System.out.println("\nEntering score for student " + (studentIndex + 1));
            int studentTotalScore = 0;

            for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++){
                System.out.print("Enter score for subject " + (subjectIndex + 1) + ": ");
                studentScores[studentIndex][subjectIndex] = input.nextInt();

                while(studentScores[studentIndex][subjectIndex] < 0 || studentScores[studentIndex][subjectIndex] > 100){
                    System.out.print("Invalid score, enter a score between 0 - 100: ");
                    studentScores[studentIndex][subjectIndex] = input.nextInt();
                }

                studentTotalScore += studentScores[studentIndex][subjectIndex];

                if (studentScores[studentIndex][subjectIndex] > highestScoreOverall){
                    highestScoreOverall = studentScores[studentIndex][subjectIndex];
                    highestScoreStudent = studentIndex;
                    highestScoreSubject = subjectIndex;
                }
                if (studentScores[studentIndex][subjectIndex] < lowestScoreOverall){
                    lowestScoreOverall = studentScores[studentIndex][subjectIndex];
                    lowestScoreStudent = studentIndex;
                    lowestScoreSubject = subjectIndex; 
                }

                if (studentScores[studentIndex][subjectIndex] >= 50){
                    passPerSubject[subjectIndex]++;
                }
                else {
                    failPerSubject[subjectIndex]++;
                }
            }
            
            totalScoresPerStudent[studentIndex] = studentTotalScore;
            averageScoresPerStudent[studentIndex] = studentTotalScore / subjectCount;
            classTotalScores += studentTotalScore;
            
        }

        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++){
            int position = 1;

            for (int otherStudentIndex = 0; otherStudentIndex < studentCount; otherStudentIndex++){
                if (totalScoresPerStudent[otherStudentIndex] > totalScoresPerStudent[studentIndex]){
                    position++;
                }
            }
    
            studentPositions[studentIndex] = position;
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
            for(int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++){
                System.out.printf("%10d", studentScores[studentIndex][subjectIndex]);
            }
            System.out.printf("%10d", totalScoresPerStudent[studentIndex]);
            System.out.printf("%10d", averageScoresPerStudent[studentIndex]);
            System.out.printf("%10d", studentPositions[studentIndex]);
            System.out.println();
        }

        System.out.println();
        System.out.println("SUBJECT SUMMARY");
        System.out.println("==================================================================");

        for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++){
            int highestScoreInSubject = studentScores[0][subjectIndex];
            int lowestScoreInSubject = studentScores[0][subjectIndex];

            int subjectTotalScore = 0;
            double subjectAverageScore = 0;
            
            int passCount = 0;
            int failCount = 0;

            int highestScoringStudentInSubject = 0;
            int lowestScoringStudentInSubject = 0;

            System.out.println("Subject " + (subjectIndex + 1));

            for (int studentIndex = 0; studentIndex < studentCount; studentIndex++){
                int score = studentScores[studentIndex][subjectIndex];
                subjectTotalScore += score;

                if (score >= 50){
                    passCount++;
                }
                else {
                    failCount++;        
                }

                if (score > highestScoreInSubject){
                    highestScoreInSubject = score;
                    highestScoringStudentInSubject = studentIndex;
                }
                if (score < lowestScoreInSubject){
                    lowestScoreInSubject = score;
                    lowestScoringStudentInSubject = studentIndex;
                }
            }

            subjectAverageScore = subjectTotalScore / studentCount;

            System.out.println("Highest Scoring student is:  Student " + (highestScoringStudentInSubject + 1) + " scoring " + highestScoreInSubject);
            System.out.println("Lowest Scoring student is:  Student " + (lowestScoringStudentInSubject + 1) + " scoring " + lowestScoreInSubject);
            System.out.println("Total Score is: " + subjectTotalScore);
            System.out.println("Average Score is: " + subjectAverageScore);
            System.out.println("Number of Passes: " + passCount);
            System.out.println("Number of Fails: " + failCount);
            System.out.println();
        }

        int hardestSubjectIndex = 0;
        int hardestSubjectFailCount = failPerSubject[0];
        int easiestSubjectIndex = 0;
        int easiestSubjectPassCount = passPerSubject[0];

        for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++){
            if (passPerSubject[subjectIndex] > easiestSubjectPassCount){
                easiestSubjectIndex = subjectIndex;
                easiestSubjectPassCount = passPerSubject[subjectIndex];
            }
            if (failPerSubject[subjectIndex] > hardestSubjectFailCount){
                hardestSubjectIndex = subjectIndex;
                hardestSubjectFailCount = failPerSubject[subjectIndex];
            }
        }
        
        System.out.println("\nThe hardest subject is subject " + (hardestSubjectIndex + 1) + " with " + hardestSubjectFailCount + " failures");
        System.out.println("The easiest subject is subject " + (easiestSubjectIndex + 1) + " with " + easiestSubjectPassCount + " passes");
        System.out.println("The overall highest score is scored by student " + (highestScoreStudent + 1) + " in subject " + (highestScoreSubject + 1) + " scoring " + highestScoreOverall);
        System.out.println("The overall lowest score is scored by student " + (lowestScoreStudent + 1) + " in subject " + (lowestScoreSubject + 1) + " scoring " + lowestScoreOverall);
        
        System.out.println();
        System.out.println("==================================================================");
        System.out.println("CLASS SUMMARY");
        System.out.println("==================================================================");

        int bestGraduatingStudentIndex = 0;
        int worstGraduatingStudentIndex = 0;

        int bestGraduatingStudentScore = totalScoresPerStudent[0];
        int worstGraduatingStudentScore = totalScoresPerStudent[0];

        for (int studentIndex = 1; studentIndex < studentCount; studentIndex++){
            if (totalScoresPerStudent[studentIndex] > bestGraduatingStudentScore){
                bestGraduatingStudentScore = totalScoresPerStudent[studentIndex];
                bestGraduatingStudentIndex = studentIndex;
            }
            if (totalScoresPerStudent[studentIndex] < worstGraduatingStudentScore){
                worstGraduatingStudentScore = totalScoresPerStudent[studentIndex];
                worstGraduatingStudentIndex = studentIndex;
            }
        }
        
        classAverageScore = classTotalScores / studentCount;

        System.out.println("Best Graduating Student is: Student " + (bestGraduatingStudentIndex + 1) + " scoring " + bestGraduatingStudentScore);

        System.out.println("Worst Graduating Student is: Student " + (worstGraduatingStudentIndex + 1) + " scoring " + worstGraduatingStudentScore);

        System.out.println("------------------------------------------------------------------");
        System.out.println("Class Total Score   : " + classTotalScores);
        System.out.println("Class Average Score : " + classAverageScore);
        System.out.println("==================================================================");
    }
}
