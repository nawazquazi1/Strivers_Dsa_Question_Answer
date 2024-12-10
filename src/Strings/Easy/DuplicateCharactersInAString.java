package Strings.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharactersInAString {

    public static void main(String[] args) {
        String str = "nawazquaziakib";
        System.out.println(findDuplicates1(str));
    }

    public static HashSet<Character> findDuplicates(String str) {
        char[] ch = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    set.add(ch[j]);
                }
            }
        }
        return set;
    }

    public static HashSet<Character> findDuplicates0(String str) {
        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.add(ch)) { // If add returns false, it's a duplicate
                duplicates.add(ch);
            }
        }
        return duplicates;
    }

    public static Set<Character> findDuplicates1(String str) {
        Set<Character> set = new HashSet<>();

        return str.chars() // Stream of int (Unicode values of characters)
                .mapToObj(c -> (char) c) // Convert to Character stream
                .filter(c -> !set.add(c)) // Keep only duplicates
                .collect(Collectors.toSet()); // Collect duplicates into a set

    }

    public static Set<Character> findDuplicates2(String str) {
        return str.chars() // Stream of int (Unicode values)
                .mapToObj(c -> (char) c) // Convert to Character stream
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())) // Count occurrences
                .entrySet().stream() // Stream of Map.Entry<Character, Long>
                .filter(entry -> entry.getValue() > 1) // Keep only duplicates
                .map(Map.Entry::getKey) // Extract the character
                .collect(Collectors.toSet()); // Collect as a Set
    }
}
