public class EvenOddCounter {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 20, 33, 18, 9, 40, 11, 22};
        int evenCount = 0;
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total Even Numbers = " + evenCount);
        System.out.println("Total Odd Numbers = " + oddCount);
    }
}
