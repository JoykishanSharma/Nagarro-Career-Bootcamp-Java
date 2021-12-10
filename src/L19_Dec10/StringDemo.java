package L19_Dec10;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        // create String using literal
        String s = "hello"; // 2k
        String s1 = "hello"; // 2k

        System.out.println(s + " " + s1);

        s = "bye"; // 3k
        s1 = "bye"; //3k

        System.out.println(s + " " + s1);

        s = "hello"; // 2k

        // length obtain
        System.out.println(s.length());

        // charAt
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(s.length() - 1));

        // substring
        System.out.println(s.substring(1, 3));
        System.out.println(s.substring(0, 4));
        System.out.println(s.substring(2, 2).length());
        //System.out.println(s.substring(3, 0));

        System.out.println(s.substring(1));

        // index
        System.out.println(s.indexOf('l'));

        // endsWith
        System.out.println(s.endsWith("llo"));
        System.out.println(s.endsWith("ll"));

        // new String
        String s5 = new String("hello"); // 5k
        String s6 = new  String("hello"); // 6k

        s6 = new String("bye");
        s6 = s;

        //
        String s7 = "Hello";
        String s8 = s7;
        String s9 = "Hello";
        String s10 = new String("Hello");

        // equal() & ==
        System.out.println((s7 == s8) + ", " + s7.equals(s8));
        System.out.println((s7 == s9) + ", " + s7.equals(s9));
        System.out.println((s7 == s10) + ", " + s7.equals(s10));

        // substring creates a new string
        String s11 = "hello";
        String s12 = "helloworld";

        String s13 = s12.substring(0, 5);

        System.out.println(s11 + " " + s12 + " " + s13);

        // concate
        String s14 = "world";
        String s15 = s11.concat(s14);

        System.out.println(s11 + " " + s14 + " " + s15);

        // take input
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(str);
    }
}
