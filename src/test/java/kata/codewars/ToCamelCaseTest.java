package kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToCamelCaseTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_stealth_warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart1() {
        String input = "side_Square_side_river_Samurai_desert_mountain_mountain_Black_Black_Green";
        System.out.println("input: "+input);
        assertEquals("sideSquareSideRiverSamuraiDesertMountainMountainBlackBlackGreen", ToCamelCase.toCamelCase(input));
    }
}
