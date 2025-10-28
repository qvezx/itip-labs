package tasks;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        System.out.println(average(a, b, c));
    }

    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}