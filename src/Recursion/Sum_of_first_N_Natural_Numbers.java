package Recursion;

public class Sum_of_first_N_Natural_Numbers {
    static void func(int i, int sum){

        // Base Condition.
        if(i<1){

            System.out.println(sum);
            return;
        }

        // Function call to increment sum by i till i decrements to 1.
        func(i-1,sum+i);


    }
    public static void main(String[] args) {

        // Here, let’s take the value of n to be 3.
        int n = 4;
        func(n,0);
    }
}
