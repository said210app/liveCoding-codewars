package kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondTest {

    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), Diamond.print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), Diamond.print(5));
    }
    @Test
    public void testDiamond7() {
        StringBuffer expected = new StringBuffer();
        expected.append("   *\n");
        expected.append("  ***\n");
        expected.append(" *****\n");
        expected.append("*******\n");
        expected.append(" *****\n");
        expected.append("  ***\n");
        expected.append("   *\n");

        assertEquals(expected.toString(), Diamond.examplePrint2(7));
    }
    @Test
    public void testDiamond9() {
        StringBuffer expected = new StringBuffer();
        expected.append("    *\n");
        expected.append("   ***\n");
        expected.append("  *****\n");
        expected.append(" *******\n");
        expected.append("*********\n");
        expected.append(" *******\n");
        expected.append("  *****\n");
        expected.append("   ***\n");
        expected.append("    *\n");

        assertEquals(expected.toString(), Diamond.print(9));
    }@Test
    public void testDiamond11() {
        StringBuffer expected = new StringBuffer();
        expected.append("     *\n");
        expected.append("    ***\n");
        expected.append("   *****\n");
        expected.append("  *******\n");
        expected.append(" *********\n");
        expected.append("***********\n");
        expected.append(" *********\n");
        expected.append("  *******\n");
        expected.append("   *****\n");
        expected.append("    ***\n");
        expected.append("     *\n");

        assertEquals(expected.toString(), Diamond.print(11));
    }

    @Test
    public void testDiamond1() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        assertEquals(expected.toString(), Diamond.print(1));
    }

    @Test
    public void testDiamond0() {
        assertEquals(null, Diamond.print(0));
    }

    @Test
    public void testDiamondMinus2() {
        assertEquals(null, Diamond.print(-2));
    }

    @Test
    public void testDiamond2() {
        assertEquals(null, Diamond.print(2));
    }
}
