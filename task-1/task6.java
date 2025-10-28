package tasks;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        System.out.println(checkAge(a));
    }

    public static String checkAge(int a) {
        if (a >= 18) {
            return "совершеннолетний";
        }

        return "несовершеннолетний";
    }
}