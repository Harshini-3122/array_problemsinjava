import java.util.Scanner;
public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        System.out.println("--- All Marks ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
        int highest = marks[0];
        int lowest = marks[0];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }
        double average = total / 5.0;
        System.out.println("Highest Mark = " + highest);
        System.out.println("Lowest Mark = " + lowest);
        System.out.println("Average Marks = " + average);
    }
}
