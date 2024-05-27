package Basice_Maths;

public class Armstrong_Number {

    public static boolean isArmstrong(int num) {
        // Calculate the number of
        // digits in the given number
        int k = String.valueOf(num).length();
        // Initialize the sum of digits
        // raised to the power of k to 0
        int sum = 0;
        // Copy the value of the input
        // number to a temporary variable n
        int n = num;
        // Iterate through each
        // digit of the number
        while (n > 0) {
            // Extract the last
            // digit of the number
            int ld = n % 10;
            // Add the digit raised to
            // the power of k to the sum
            sum += (int) Math.pow(ld, k);
            // Remove the last digit
            // from the number
            n = n / 10;
        }
        // Check if the sum of digits raised to
        // the power of k equals the original number
        return sum == num;
    }

    public static void main(String[] args) {

        System.out.println(isArmstrong(1531));
    }
}
