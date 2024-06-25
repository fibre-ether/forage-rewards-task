import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    double MILES_TO_CASH_CONVERSION_FACTOR = 0.035;

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        int milesValue = (int) (cashValue/MILES_TO_CASH_CONVERSION_FACTOR);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }
    
    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 100;
        double cashValue = milesValue*MILES_TO_CASH_CONVERSION_FACTOR;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }
}
