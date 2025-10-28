package tasks;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        System.out.println(season(a));
    }

    public static String season(int a) {
        return switch (a) {
            case 3, 4, 5 -> "весна";
            case 12, 1, 2 -> "зима";
            case 6, 7, 8 -> "лето";
            default -> "осень";
        };
    }
}