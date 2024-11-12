package Important_Sorting.Sorting_1;

import java.util.Arrays;

public class Bubble_Sort {
    public static int[] bubble_Sort(int[] arr) {  //int[]{41, 467 ,334 ,500 ,169 ,724 ,478 ,358, 962, 464})
        for (int i=0;i<arr.length;i++){
            int didSwap=0;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    didSwap=1;
                }
                if(didSwap==0){
                    break;
                }
            }
        }

        return arr;
    }
    public static int[] bubble_Sort_2(int[] arr,int n) {
        for (int i = n - 1; i >= 0; i--) {
            int didSwap=0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubble_Sort(new int[]{41, 467 ,334 ,500 ,169 ,724 ,478 ,358, 962, 464})));
        System.out.println(Arrays.toString(bubble_Sort_2(new int[]{41, 467 ,334 ,500 ,169 ,724 ,4,34,54,35,43,3,4,353,34,5,23,43,34,2315,32,478 ,358, 962, 464},25)));
    }

}
