package Array.Easay;

import java.util.Arrays;

public class Find_First_And_Last_Position_Linear {
    public static int[] findFirstAndLastPositionLinear(int[] arr, int target) {
        int first = -1;
        int last = -1;
    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;  // first occurrence found
                }
                last = i;  // update last occurrence every time we find the target
            }
        }
    
        return new int[] {first, last};
    }


    public static int[] findFirstAndLastPosition(int [] arr ,int target){
        int first=-1;
        int last=-1;



        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                first=i;
                break;
            }
        }

        for (int i = arr.length-1;i>=0; i--) {
            if(arr[i]==target){
                last=i;
                break;
            }
        }


        return new int[]{first,last};
    }




    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3,8,8,9,10,11,45,367};
        int target = 8;
        System.out.println(Arrays.toString(findFirstAndLastPositionLinear(arr, target)));
    }
}
