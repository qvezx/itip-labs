package tasks;

import java.util.Scanner;

public class Task_5 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        System.out.println(daysToWeeks(a));
    }

    public static String daysToWeeks(int a) {
        int weeks = a / 7;
        int days = a % 7;

        String strWeak;
        String strDays;

        switch (weeks) {
            case 1 -> strWeak = "неделя";
            case 2, 3, 4 -> strWeak = "недели";
            default -> strWeak = "недель";
        };

        switch (days) {
            case 1 -> strDays = "день";
            case 2, 3, 4 -> strDays = "дня";
            default -> strDays = "дней";
        };

        return weeks + " " + strWeak + " и " + days + " " + strDays;
    }
}