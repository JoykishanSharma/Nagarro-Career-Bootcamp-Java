package L10_Nov19;

public class FunctionDemo {

    static int sum = 400;

    public static void main(String[] args) {

        System.out.println("hello");

        // case 1 : Basic
        //fxn calling
        System.out.println("----- Case 1 -----");
        addition();
        subtraction();

        // case 2 : Parameters
        System.out.println("----- Case 2 -----");
        int x = 100;
        int y = 200;
        additionParams(x, y);

        // case 3 : Return
        System.out.println("----- Case 3 -----");
        int sum = additionReturn(x, y);
        System.out.println(sum);

        // case 4 : access global static variable num
        System.out.println(FunctionDemo.sum);

        System.out.println("bye");
    }

    public static int additionReturn(int a, int b) {
        return a + b;
    }

    public static void additionParams(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    private static void subtraction() {
        int a = 10;
        int b = 20;

        int minus = a + b;

        System.out.println("Sum is " + minus);
    }

    private static void addition() {

        int a = 10;
        int b = 20;

        int sum = a + b;

        subtraction();

        System.out.println("Sum is " + sum);
    }


}
