package Array.Easay;

public class Find_the_missing_number_in_an_array {
    public static int missingNumber(int[] a, int N) {
        // Outer loop that runs from 1 to N:
        for (int i = 1; i <= N; i++) {
            // flag variable to check
            //if an element exists
            int flag = 0;
            //Search the element using linear search:
            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {
                    // i is present in the array:
                    flag = 1;
                    break;
                }
            }
            // check if the element is missing
            //i.e flag == 0:
            if (flag == 0){
                return i;
            }
        }
        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static void main(String[] args) {
        int N = 0;
        int[] a = {1};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }



}
