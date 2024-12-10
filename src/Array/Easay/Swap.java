package Array.Easay;

public class Swap {

    public static void main(String[] args) {
//        Write a Java Program to swap two numbers without using the third
//        variable.

        swapNumbers(12,13);

    }
        public static void swapNumbers(int a, int b) {
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("After swap: a = " + a + ", b = " + b);
        }
}
