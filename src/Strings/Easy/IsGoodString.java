package Strings.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsGoodString {
    public static void main(String[] args) {
        System.out.println(isGoodString("aabbcc")); // true
        System.out.println(isGoodString("aabbccc")); // false
    }


    public static boolean isGoodString(String s) {
        // Step 1: Count character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Extract frequencies and check if all are equal
        Set<Integer> frequencySet = new HashSet<>(frequencyMap.values());

        // Step 3: If the size of the set is 1, all frequencies are the same
        return frequencySet.size() == 1;
    }
}
