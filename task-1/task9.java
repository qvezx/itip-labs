package tasks;

import java.util.Scanner;

public class Task_9 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        System.out.println(isPrime(a));
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}