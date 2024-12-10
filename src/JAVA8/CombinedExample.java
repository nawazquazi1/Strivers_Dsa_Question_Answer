package JAVA8;

import java.util.List;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class CombinedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David","AKIB","Ateeq");

        Predicate<String> startsWithA = name -> name.startsWith("A");
        Function<String, String> toUpperCase = String::toUpperCase;
        Consumer<String> printName = System.out::println;

        names.stream()
                .filter(startsWithA)          // Filter names starting with "A"
                .map(toUpperCase)             // Convert to uppercase
                .forEach(printName);          // Print the names

         List<String> list= names.stream()
                .filter(starts ->starts.startsWith("A"))          // Filter names starting with "A"
                .map(String::toUpperCase)             // Convert to uppercase
                .toList();
        // Output: ALICE
    }
}


