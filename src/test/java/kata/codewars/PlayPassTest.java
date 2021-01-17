package kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayPassTest {

    @Test
    public void test1() {
        assertEquals("!!!vPz fWpM J", PlayPass.playPass("I LOVE YOU!!!", 1));
    }

    @Test
    public void test4() {
        assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO",
                PlayPass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
    }
    @Test
    public void circularShift() {
        assertEquals("b",
                PlayPass.circularShift("a", 1));
        assertEquals("z",
                PlayPass.circularShift("a", 25));
        assertEquals("a",
                PlayPass.circularShift("a", 26));
        assertEquals("a",
                PlayPass.circularShift("z", 1));
    }
    @Test
    public void dijitComplement() {
        assertEquals("8",
                PlayPass.digitComplement("1"));
        assertEquals("9",
                PlayPass.digitComplement("0"));
    }
}
