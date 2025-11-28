import java.util.Scanner;
public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 3, 2, 7, 2, 5, 3, 2};
        System.out.print("Enter a number to count: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println("Number " + num + " appears " + count + " times.");
    }
}
