package Practice2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some words(:");
        String word = scanner.nextLine();
        var arr = word.split("\\s+");
        System.out.println("Number of words: " + arr.length);
    }
}
