package Basice_Maths;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisors_Number {

    public static void printDivisors(int n) {

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void print_Divisors(int n) {

        int sqrtN = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i) {
                    System.out.println(n / i);
                }
            }
        }
    }

    static long sumOfDivisors(int N) {
        // code here
        long sum_divisors = 0;
        for (int k = 1; k <= N; k++) {
            sum_divisors += (long) k * (N / k);
        }
        return sum_divisors;
    }


    public static void main(String[] args) {
//        printDivisors(36);
        System.out.println(sumOfDivisors(4));
    }

}
