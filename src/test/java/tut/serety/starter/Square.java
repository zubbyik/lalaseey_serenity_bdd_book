package tut.serety.starter;

public class Square {
    int height;
    int width;
    int product;
    public Square(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void calcualteArea() {
    this.product = this.height * this.width;
    }

    public int getArea() {
        return this.product;
    }
}
