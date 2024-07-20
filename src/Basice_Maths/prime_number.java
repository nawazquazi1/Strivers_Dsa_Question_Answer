package Basice_Maths;

public class prime_number {

    public static boolean checkPrime(int n) {
        // Initialize a counter variable to
        // count the number of factors.
        int cnt = 0;
        // Loop through numbers from 1 to n.
        for (int i = 1; i *i<= n ; i++) {
            // If n is divisible by i
            // without any remainder.
            if (n % i == 0) {
                // Increment the counter.
                cnt = cnt + 1;
            }
        }
        return cnt == 2;
    }

    public static boolean check_Prime(int n) {
        int cnt = 0;
        // Loop through numbers from 1
        // to the square root of n.
        for (int i = 1; i <= Math.sqrt(n); i++) {
            // If n is divisible by i
            // without any remainder.
            if (n % i == 0) {
                // Increment the counter.
                cnt = cnt + 1;
                // If n is not a perfect square,
                // count its reciprocal factor.
                if (n / i != i) {
                    cnt = cnt + 1;
                }
            }
        }
        return cnt == 2;
    }


    public static void main(String[] args) {
        int n = 222222222;
        boolean isPrime = checkPrime(n);
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

