package kata.codewars;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

//https://www.codewars.com/kata/559536379512a64472000053/train/java
public class PlayPass {
    public static String playPass(String s, int n) {
        AtomicInteger index = new AtomicInteger();
        return new StringBuilder(Arrays.stream(s.split(""))
                .map(c -> circularShift(c, n))
                .map(PlayPass::digitComplement)
                .map(c ->  index.incrementAndGet() % 2 == 0 ? c.toLowerCase() : c.toUpperCase())
                .collect(Collectors.joining("")))
                .reverse().toString();
    }

    protected static String circularShift(String c, int n){
        if (c.matches("[\\w]") && !(c.matches("[0-9]"))) {
            int asciiIndex = (c.toLowerCase().toCharArray()[0] + n ) % 123;
            return String.valueOf(((char) getAsciiIndex(asciiIndex)));
        }
        return c;
    }

    protected static String digitComplement(String c){
        if (c.matches("[0-9]")) {
            return ""+(9 - Integer.parseInt(c));
        }
        return c;
    }

    private static int getAsciiIndex(int asciiIndex) {
        return asciiIndex <  97 ? asciiIndex + 97 : asciiIndex;
    }
}
