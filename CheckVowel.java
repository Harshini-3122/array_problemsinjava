import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        boolean hasVowel = false;
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                hasVowel = true;
                break;
            }
        }
        if (hasVowel)
            System.out.println("Vowel is present");
        else
            System.out.println("No vowel found");
    }
}
