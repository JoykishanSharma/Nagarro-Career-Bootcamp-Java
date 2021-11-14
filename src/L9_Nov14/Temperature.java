package L9_Nov14;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minF = scanner.nextInt();
        int maxF = scanner.nextInt();
        int step = scanner.nextInt();
        scanner.close();

        for (int f = minF; f <= maxF; f = f + step) {
            int cel = (int) ((5.0 / 9) * (f - 32));
            System.out.println(f + "\t" + cel);
        }
    }
}
