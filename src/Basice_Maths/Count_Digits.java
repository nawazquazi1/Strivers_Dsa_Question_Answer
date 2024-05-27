package Basice_Maths;

public class Count_Digits {
    public static int evenlyDivides(int N) {
        int temp = N, count = 0;
        while (temp != 0) {
            // extract the last digit
            int d = temp % 10;
            temp /= 10;

            // check if d divide N completely
            if (d > 0 && N % d == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(evenlyDivides(873487));
    }


}
