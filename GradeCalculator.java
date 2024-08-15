import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] scores = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }

        double averageScore = (double) totalScore / numSubjects;

        String grade = getGrade(averageScore);

        System.out.println("Student Name: " + studentName);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
    }

    public static String getGrade(double averageScore) {
        if (averageScore >= 90) {
            return "A";
        } else if (averageScore >= 80) {
            return "B";
        } else if (averageScore >= 70) {
            return "C";
        } else if (averageScore >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}