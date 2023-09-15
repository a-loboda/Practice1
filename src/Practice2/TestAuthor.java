package Practice2;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, email;
        char gender;
        System.out.println("Name?");
        name = scanner.next();
        System.out.println("email?");
        email = scanner.next();
        System.out.println("gender?(M/F)");
        gender = scanner.next().charAt(0);
        if (gender != 'M' && gender != 'F') {
            System.out.println("Invalid input. There are only two genders(M/F)");
            return;
        }
        Author author = new Author(name, email, gender);
        System.out.println("getName result: " + author.getName());
        System.out.println("getEmail result: " + author.getEmail());
        System.out.println("getGender result: " + author.getGender());
        System.out.println("toString result:\n" + author.toString());
        System.out.println("Set new email:");
        email = scanner.next();
        author.setEmail(email);
        System.out.println("toString result:\n" + author.toString());
    }
}
