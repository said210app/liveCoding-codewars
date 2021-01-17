package kata.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
public class ToCamelCase {
    static String toCamelCase(String s) {
        String[] words = s.split("[-_]");
        return words[0].concat( Arrays.stream(words,1,words.length).map(w ->
             w.substring(0, 1).toUpperCase() + w.substring(1)
        ).collect(Collectors.joining("")));
    }
}
