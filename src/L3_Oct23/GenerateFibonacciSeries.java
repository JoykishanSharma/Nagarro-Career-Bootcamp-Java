package L3_Oct23;

import java.util.Scanner;

public class GenerateFibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        
        int a = 0;
        int b = 1;
        int c = 0;
        int counter = 1;
        
        while (counter < number) {
            c = a + b;
            a = b;
            b = c;
            counter++;
        }

            System.out.println("Nth Fibonacci Number is " + c);
    }



}
