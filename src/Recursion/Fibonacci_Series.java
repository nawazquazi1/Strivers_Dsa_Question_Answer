package Recursion;

public class Fibonacci_Series {

    static int fibonacci(int N){

        // Base Condition.
        if(N <= 1){
            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);

        return last+slast;


    }
    public static void main(String[] args) {
        int N = 5;
        System.out.println(fibonacci(N));
    }
}
