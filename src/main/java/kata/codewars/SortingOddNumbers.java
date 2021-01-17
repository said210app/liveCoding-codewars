package kata.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOddNumbers {
    //https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java
    public static int[] sortArray(int[] array) {
        int length = array.length;
        if (length == 0) {
            return array;
        }
        List<Integer> odd = Arrays.stream(array)
                .filter(SortingOddNumbers::isOdd)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        int pos = 0;
        for (int n: odd) {
            for (int i = pos; i < length; i++) {
                if (isOdd(array[i])) {
                    array[i] = n;
                    pos = i+1;
                    break;
                }
            }
        }
        return array;
    }

    private static boolean isOdd(int i) {
        return i % 2 != 0;
    }
}
