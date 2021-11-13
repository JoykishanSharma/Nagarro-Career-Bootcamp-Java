package L8_Nov13;

public class DataTypeDemo {
    public static void main(String[] args) {

        byte by = 10;
        short sh = 10;
        int in = 10;
        long lo = 10;

        // case 1
        // by = sh;
        // by = in;
        // by = lo;

        // case 2
        sh = by;
        in = by;
        lo = by;

        // case 3
        sh = 1030;
        by = (byte) sh;
        System.out.println("short = " + sh);
        System.out.println("byte = " + by);

        // case 4
        sh = 10;
        by = (byte) sh;
        System.out.println("short = " + sh);
        System.out.println("byte = " + by);

    }
}
