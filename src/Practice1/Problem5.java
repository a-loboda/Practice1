package Practice1;

import java.util.Scanner;

public class Problem5 {
    public static int getFactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; ++i, f *= i) {}
        return f;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("n?");
        n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Invalid in");
            return;
        }
        System.out.println("n!: " + getFactorial(n));
    }
}
