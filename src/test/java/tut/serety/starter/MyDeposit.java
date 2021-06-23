package tut.serety.starter;

public class MyDeposit {
    private double initialDeposit;
    private double YearOneSavings;
    private double YearTwoSavings;
    private double YearThreeSavings;

    public MyDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }


    public double calculateYearOne(double savingInterest) {
        this.YearOneSavings = this.initialDeposit + savingInterest*this.initialDeposit;
        return this.YearOneSavings;
    }

    public double calculateYearTwo(double savingInterest) {
        this.YearTwoSavings = this.YearOneSavings + savingInterest*this.YearOneSavings;
        return this.YearTwoSavings;
    }

    public double calculateYearThree(double savingInterest) {
        this.YearThreeSavings = this.YearTwoSavings + this.YearTwoSavings*savingInterest;
        return this.YearThreeSavings;
    }
}
