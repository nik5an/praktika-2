package training.day5;

public class Rectangle implements Shape {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculateArea() {
        return a * b;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (a + b);
    }

}
