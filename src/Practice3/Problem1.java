package Practice3;
import java.util.Random;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the array size");
        n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Invalid in");
            return;
        }
        System.out.println("Use Random or Math?(R/M)");
        char c = scanner.next().charAt(0);
        if (c != 'R' && c != 'M') {
            System.out.println("Invalid in");
            return;
        }
        double[] arr = new double[n];
        System.out.println("Generated array:");
        for (int i = 0; i < n; ++i) {
            arr[i] = (c == 'R' ? rand.nextDouble() : Math.random());
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i + 1 < n; ++i)
            for (int j = 0; j + i + 1 < n; ++j)
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println("\nSorted array:");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
