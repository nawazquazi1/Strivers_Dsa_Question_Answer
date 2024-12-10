package Strings.Easy;

import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args) {
        String str="nawazquazijsvjfj sdjasdnwufc zx cs jf jnamlkc o vj xoivnosi";
        System.out.println(sortString2(str));
    }






    public static String sortString(String str) {
        // Remove all white spaces
        String s = str.replaceAll(" ", "");

        // Convert the string to a character array
        char[] c = s.toCharArray();

        // Sort the character array manually using Bubble Sort
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if (c[j] > c[j + 1]) {
                    // Swap c[j] and c[j+1]
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

        // Convert the sorted character array back to a string
        StringBuilder sortedString = new StringBuilder();
        for (char ch : c) {
            sortedString.append(ch);
        }

        return sortedString.toString();
    }

    public static String sortString2(String str) {
        return str.chars() // Convert the string to a stream of character codes
                .filter(c -> !Character.isWhitespace(c)) // Remove white spaces
                .boxed() // Box the int values to Integer to use custom sorting
                .sorted((a, b) -> a - b) // Sort using custom comparator
                .map(c -> String.valueOf((char) c.intValue())) // Convert back to characters
                .collect(Collectors.joining()); // Join the sorted characters into a string
    }
}
