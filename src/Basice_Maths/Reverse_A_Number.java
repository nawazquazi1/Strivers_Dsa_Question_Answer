package Basice_Maths;

public class Reverse_A_Number {

    public static int reverse(int x) {
        int revers = 0;
        while (x != 0) {
            int ld = x % 10;
            revers = (revers * 10) + ld;
            x /= 10;
        }
        return revers;
    }

    public static void main(String[] args) {
        System.out.println(reverse(3243));
    }
}
