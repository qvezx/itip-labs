package tasks;

import java.util.Scanner;

public class Task_8 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String a = inp.nextLine();

        System.out.println(isPalidrome(a));
    }

    public static String reverseString(String s) {
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }

        return reversed;
    }

    public static boolean isPalidrome(String s) {
        return s.equals(reverseString(s));
    }
}