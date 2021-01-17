package kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingOddNumbersTest {

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortingOddNumbers.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortingOddNumbers.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortingOddNumbers.sortArray(new int[]{}));
    }
}
