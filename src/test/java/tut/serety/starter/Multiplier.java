package tut.serety.starter;

public class Multiplier {
    private int amount;

    public Multiplier(int amount) {
        this.amount = amount;
    }


    public void multiplyBy(int multiple) {
        this.amount *= multiple;
    }


    public int getMultpiple() {
        return this.amount;
    }
}
