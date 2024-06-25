public class RewardValue {
    double cashValue;
    double MILES_TO_CASH_CONVERSION_FACTOR = 0.035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_FACTOR;
    }

    public int getMilesValue() {
        return (int) (this.cashValue / MILES_TO_CASH_CONVERSION_FACTOR);
    }

    public double getCashValue() {
        return this.cashValue;
    }
}