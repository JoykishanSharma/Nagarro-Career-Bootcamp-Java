package Assignment2_Nov22;

import java.util.Scanner;

public class ConversionAnyToAny {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sourceBase = scanner.nextInt();
        int destinationBase = scanner.nextInt();
        int numberInSourceBase = scanner.nextInt();
        scanner.close();

        if (sourceBase != 10 || destinationBase != 10) {
            numberInSourceBase = sourceBaseToDecimalBase(sourceBase, numberInSourceBase);
            sourceBase = 10;
        }

        int multiplier = 1;
        int numberInDestinationBase = 0;

        while (numberInSourceBase != 0) {

            int reminder = numberInSourceBase % destinationBase;
            numberInDestinationBase = numberInDestinationBase + reminder * multiplier;
            multiplier = multiplier * sourceBase;
            numberInSourceBase = numberInSourceBase / destinationBase;
        }

        System.out.println(numberInDestinationBase);

    }

    private static int sourceBaseToDecimalBase(int sourceBase, int numberInSourceBase) {

        int multiplier = 1;
        int numberInDecimalBase = 0;

        while (numberInSourceBase != 0) {

            int reminder = numberInSourceBase % 10;
            numberInDecimalBase = numberInDecimalBase + reminder * multiplier;
            multiplier = multiplier * sourceBase;
            numberInSourceBase = numberInSourceBase / 10;
        }

        return numberInDecimalBase;
    }
}
