package Practice1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of array?");
        int n;
        n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid in");
            return;
        }
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Array elements?");
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("sum: " + sum);
        System.out.println("average: " + (sum / (double)n));
    }
}
