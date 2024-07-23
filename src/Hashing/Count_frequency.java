package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Count_frequency {

    public static void Frequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
//        for (int j : arr) {
//            if (map.containsKey(j)) {
//                map.put(j, map.get(j)+1);
//            } else {
//                map.put(j, 1);
//            }
//        }
        for (int j:arr){
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void countFreq(int[] arr, int n)
    {
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i])
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        Frequency(arr);

    }
}
