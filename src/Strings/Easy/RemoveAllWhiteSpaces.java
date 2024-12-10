package Strings.Easy;

import java.util.stream.Collectors;

public class RemoveAllWhiteSpaces {

    public static void main(String[] args) {
        System.out.println(removeAllWhiteSpaces("jsdfkj j sajf ja fja sjk cjs fjas jf akj"));
    }


    public static String removeAllWhiteSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeAllWhiteSpaces1(String str) {
        return str.chars() // Convert the string to an IntStream of character codes
                .filter(c -> !Character.isWhitespace(c)) // Filter out whitespace characters
                .mapToObj(c -> String.valueOf((char) c)) // Convert character codes back to Strings
                .collect(Collectors.joining()); // Join the characters into a single String
    }
}
