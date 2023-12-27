import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LambdaTest {

    @Test
    void testIsDivisibleBy7() {
        assertTrue(Lambda.IS_DIVISIBLE_BY_7.test(14));
        assertFalse(Lambda.IS_DIVISIBLE_BY_7.test(10));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", Lambda.TO_UPPER_CASE.apply("hello"));
        assertEquals("WORLD", Lambda.TO_UPPER_CASE.apply("world"));
    }

    @Test
    void testToName() {
        assertEquals(new Lambda.Name("John"), Lambda.TO_NAME.apply("John"));
        assertEquals(new Lambda.Name("Alice"), Lambda.TO_NAME.apply("Alice"));
    }

    @Test
    void testFareComparator() {
        Lambda.Fare fare1 = new Lambda.Fare(10, "ABC", 50.0);
        Lambda.Fare fare2 = new Lambda.Fare(10, "XYZ", 50.0);
        Lambda.Fare fare3 = new Lambda.Fare(20, "DEF", 75.0);

        assertTrue(Lambda.FARE_COMPARATOR.compare(fare1, fare2) < 0);
        assertTrue(Lambda.FARE_COMPARATOR.compare(fare1, fare3) < 0);
        assertTrue(Lambda.FARE_COMPARATOR.compare(fare2, fare3) < 0);
    }

    @Test
    void testConcat() {
        assertEquals("Hello World", Lambda.CONCAT.apply("Hello", "World"));
        assertEquals("Java Programming", Lambda.CONCAT.apply("Java", "Programming"));
    }

    @Test
    void testTimesTen() {
        assertEquals(70, Lambda.TIMES_TEN.applyAsInt(7));
        assertEquals(-20, Lambda.TIMES_TEN.applyAsInt(-2));
    }

}