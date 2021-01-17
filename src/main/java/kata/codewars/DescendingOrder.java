package kata.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DescendingOrder {
    //6 kyu
    public static int sortDesc(final int num) {
        return Integer.parseInt(
                Arrays.stream(Integer.toString(num).split(""))
                        .mapToInt(Integer::parseInt)
                        .map(i -> -i)
                        .sorted()
                        .map(i -> -i)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining("")));
    }
}
