package tasks;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        System.out.println(digitSum(a));
    }

    public static int digitSum(int a) {
        String numToStr = String.valueOf(a);
        int res = 0;

        for (int i = 0; i < numToStr.length(); i++) {
            res += Integer.parseInt(String.valueOf(numToStr.charAt(i)));
        }

        return res; 
    }
}