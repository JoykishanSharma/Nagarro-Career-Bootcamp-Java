package L9_Nov14;

import java.util.Scanner;

public class lowerUpperCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        scanner.close();

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Special Case");
        }
    }
}
