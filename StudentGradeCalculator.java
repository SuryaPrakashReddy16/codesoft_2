import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total number of subjects: ");
        int n = scan.nextInt();
        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = scan.nextDouble();
            total += marks;
        }
        double average = (double) total / n;
        String Grade;
        if (average >= 90)
        Grade = "A+";
        else if (average >= 80){
        Grade = "A";
        }
        else if (average >= 70){
        Grade = "B";
        }
        else if (average >= 60){
        Grade = "C";
        }
        else if (average >= 50){
        Grade = "D";
         }
        else {
            Grade = "F";
            }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + Grade);
    }
}