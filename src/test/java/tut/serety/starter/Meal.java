package tut.serety.starter;

public class Meal {
    double initialCost;
    double tip;
    double tax;

    public Meal(double initialCost){
    this.initialCost = initialCost;
    }

    public void addTip(double tip) {
        this.tip = this.initialCost*tip;
    }

    public void addtax(double tax) {
        this.tax = this.initialCost*tax;
    }

    public double getTotal() {
        return this.initialCost+this.tip+this.tax;
    }
}
