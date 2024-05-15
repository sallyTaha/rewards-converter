package main.java;

public class RewardValue {
    private double cashValue;
    private double milesValue;


    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor accepting miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    // Get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Convert cash to miles
    private double cashToMiles(double cash) {
        return cash * 0.0035;
    }
  

    // Convert miles to cash
    private double milesToCash(double miles) {
        return miles / 0.0035;
    }
}
