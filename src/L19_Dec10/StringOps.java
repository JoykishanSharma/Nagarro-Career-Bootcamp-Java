package L19_Dec10;

import java.util.ArrayList;

public class StringOps {
    public static void main(String[] args) {
        printChars("hello");
        System.out.println(getAllSubstrings("hello"));
        System.out.println(isPalindromeString("afifa"));
    }

    public static void printChars(String str) {
        for (char ch : str.toCharArray()) {
            System.out.println(ch);
        }
    }

    public static ArrayList<String> getAllSubstrings(String str) {
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                substrings.add(str.substring(i, j + 1));
            }
        }
        return substrings;
    }

    public static boolean isPalindromeString(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            revStr += ch;
        }
        return str.equals(revStr);
    }
}
