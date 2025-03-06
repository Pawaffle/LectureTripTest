import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostCalculatorTest {

    @BeforeAll
    static void testConstructor() {
        new CostCalculator(); // Calling the constructor
    }

    @Test
    void testStandardCase() {
        double cost = CostCalculator.doTheStuff(200, 1.5, 6);
        assertEquals(18.0, cost, 0.01, "Cost calculation failed for standard case");
    }

    @Test
    void testZeroDistance() {
        double cost = CostCalculator.doTheStuff(0, 1.5, 6);
        assertEquals(0.0, cost, "Cost should be zero when distance is zero");
    }

    @Test
    void testZeroFuelPrice() {
        double cost = CostCalculator.doTheStuff(200, 0, 6);
        assertEquals(0.0, cost, "Cost should be zero when fuel price is zero");
    }

    @Test
    void testZeroFuelConsumption() {
        double cost = CostCalculator.doTheStuff(200, 1.5, 0);
        assertEquals(0.0, cost, "Cost should be zero when fuel consumption is zero");
    }

    @Test
    void testNegativeDistance() {
        double cost = CostCalculator.doTheStuff(-100, 1.5, 6);
        assertTrue(cost < 0, "Cost should be negative for negative distance");
    }

    @Test
    void testNegativeFuelPrice() {
        double cost = CostCalculator.doTheStuff(200, -1.5, 6);
        assertTrue(cost < 0, "Cost should be negative for negative fuel price");
    }

    @Test
    void testNegativeFuelConsumption() {
        double cost = CostCalculator.doTheStuff(200, 1.5, -6);
        assertTrue(cost < 0, "Cost should be negative for negative fuel consumption");
    }
}
