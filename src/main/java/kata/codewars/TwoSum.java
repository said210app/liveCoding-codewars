package kata.codewars;

import java.util.Arrays;

//https://www.codewars.com/kata/52c31f8e6605bcc646000082/train/java
public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int[] indexes = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            indexes[0] = i;
            for (int j = i; j < numbers.length; j++) {
                if (target == numbers[i] + numbers[j]) {
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return null; // Do your magic!
    }
}
