import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RewardValueTests {

    @Test
    void testCashToMilesConversion() {
        // Arrange
        double cashValue = 100.0; // Example cash value
        RewardValue rewardValue = new RewardValue(cashValue);

        // Act
        double actualMilesValue = rewardValue.getMilesValue();

        // Assert
        double expectedMilesValue = cashValue * 0.0035; // Conversion rate
        Assertions.assertEquals(expectedMilesValue, actualMilesValue, 0.001); // Tolerance for floating-point comparison
    }

    @Test
    void testMilesToCashConversion() {
        // Arrange
        double milesValue = 350.0; // Example miles value
        RewardValue rewardValue = new RewardValue(milesValue, true);

        // Act
        double actualCashValue = rewardValue.getCashValue();

        // Assert
        double expectedCashValue = milesValue / 0.0035; // Conversion rate
        Assertions.assertEquals(expectedCashValue, actualCashValue, 0.01); // Tolerance for floating-point comparison
    }
}

