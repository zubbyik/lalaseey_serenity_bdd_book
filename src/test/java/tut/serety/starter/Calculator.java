package tut.serety.starter;

public class Calculator {
    private int total;

    public Calculator(Integer amount) {
        this.total = amount;
    }

    public int add(int amount) {
        return this.total += amount;
    }

    public Integer getTotal() {
    return this.total;
    }
}
