package Practice1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of array?");
        int n;
        n = scanner.nextInt();
        System.out.println("Elements of array?");
        if (n <= 0) {
            System.out.println("Invalid in");
            return;
        }
        int[] arr = new int[n];
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        {
            int i = 0;
            while (i < n) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
                mx = Integer.max(mx, arr[i]);
                ++i;
            }
        }
        int mn = Integer.MAX_VALUE;
        {
            int i = 0;
            do {
                mn = Integer.min(mn, arr[i]);
                ++i;
            } while (i + 1 < n);
        }
        System.out.println("sum: " + sum + "\nmin: " + mn + "\nmax: " + mx);
    }
}
