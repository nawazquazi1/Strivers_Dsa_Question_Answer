package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheNumberOfWords {

    public static void main(String[] args) {

        countWordsUsingStream("adfdfcniwefscam ev ncmqw dsfjqomfknjvs fjnfns fa f wk ejwe jgiwf sjd jc wie f sc jdbihbguies jv j dkjsfnokwnepfjskd skmxmv mnkwsenwpojrwetuuhweoinfmzxmvjsd powgenfwsv cnzxjbvjdwhpwojqwponfslkcnxvnewrqqpmnfihweb");
        countWords("adfdfcniwefscam ev ncmqw dsfjqomfknjvs fjnfns fa f wk ejwe jgiwf sjd jc wie f sc jdbihbguies jv j dkjsfnokwnepfjskd skmxmv mnkwsenwpojrwetuuhweoinfmzxmvjsd powgenfwsv cnzxjbvjdwhpwojqwponfslkcnxvnewrqqpmnfihweb");
    }

    public static void countWords(String str) {
        String s = str.replaceAll("\\s+", "");
        char[] c = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char value : c) {
//            if (map.containsKey(value)) {
//                map.put(value, map.get(value) + 1);
//            } else {
//                map.put(value, 1);
//            }
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        System.out.println(map);
    }

    public static void countWordsUsingStream(String  input) {

        Map<Character, Long> characterCount = input.chars()
                .mapToObj(c -> (char) c) // Convert int to char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterCount);

        Map<Character, Long> charCounts = input.chars()
                .mapToObj(c -> (char) c) // Convert int stream to Character stream
                .collect(
                        HashMap::new,
                        (map, c) -> map.put(c, map.getOrDefault(c, 0L) + 1),
                        Map::putAll
                );
        System.out.println(charCounts);
    }


//    java 8 code to get the 2nd non repeating char from string using streams
//
//    input->abddayttt
//    output->y



}
