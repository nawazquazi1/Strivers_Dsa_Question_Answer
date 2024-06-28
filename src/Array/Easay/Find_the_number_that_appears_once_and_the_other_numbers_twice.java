package Array.Easay;

public class Find_the_number_that_appears_once_and_the_other_numbers_twice {
    public static int getSingleElement(int []arr) {
        // Size of the array:
        int n = arr.length;

        //Run a loop for selecting elements:
        // selected element
        for (int num : arr) {
            int cnt = 0;

            //find the occurrence using linear search:
            for (int i : arr) {
                if (i == num)
                    cnt++;
            }

            // if the occurrence is 1 return ans:
            if (cnt == 1) return num;
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}
