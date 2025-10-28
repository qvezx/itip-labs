package tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();
        System.out.println(toFahrenheit(num));
    }

    public static int toFahrenheit(int n) {
        return (n * 9 / 5) + 32;
    }
}