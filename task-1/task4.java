package tasks;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int b = inp.nextInt();

        System.out.println(isEven(b));
    }

    public static boolean isEven(int b) {
        return b%2 == 0;
    }
}