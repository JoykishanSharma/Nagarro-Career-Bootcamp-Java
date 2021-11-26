package Assignment3_Nov28;

import java.util.Scanner;

public class RevisingQuadraticEquations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int root1, root2;
        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            root1 = (-b + (int) Math.sqrt(discriminant)) / 2 * a;
            root2 = (-b - (int) Math.sqrt(discriminant)) / 2 * a;

            System.out.println("Real and Distinct");
            if (root1 > root2) System.out.println(root2 + " " + root1);
            else System.out.println(root1 + " " + root2);
        } else if (discriminant == 0) {
            root1 = (-b) / 2 * a;
            root2 = (-b) / 2 * a;
            System.out.println("Real and Equal");
            System.out.println(root1 + " " + root2);
        } else System.out.println("Imaginary");
    }
}
