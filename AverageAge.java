import java.util.Scanner;
public class AverageAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many ages you want to input: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter age " + i + ": ");
            int age = sc.nextInt();
            sum += age;
        }
        double average = (double) sum / n;
        System.out.println("Average Age = " + average);
    }
}

