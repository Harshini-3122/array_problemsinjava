import java.util.Scanner;
public class LowestAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many ages you want to input: ");
        int n = sc.nextInt();
        System.out.print("Enter age 1: ");
        int minAge = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter age " + i + ": ");
            int age = sc.nextInt();
            if (age < minAge) {
                minAge = age;
            }
        }
        System.out.println("Lowest Age = " + minAge);
    }
}
