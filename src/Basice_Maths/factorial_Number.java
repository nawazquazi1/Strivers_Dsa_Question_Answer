package Basice_Maths;

public class factorial_Number {

   static int factorial(int X) {
        int ans = 1;
        for (int i = 1; i <= X; i++) {
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args) {

        int X = 10;
        int result = factorial(X);
        System.out.println("The factorial of " + X + " is " + result);
    }
}
