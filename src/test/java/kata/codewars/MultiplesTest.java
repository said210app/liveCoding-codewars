package kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplesTest {
    @Test
    public void test() {
        assertEquals(60, new Multiples().solution(16));
    }
}
