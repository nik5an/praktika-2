package training.day5;

public class Triangle implements Shape {

    int a;
    int b;
    int c;
    int h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public int calculateArea() {
        return a * h / 2;
    }

    @Override
    public int calculatePerimeter() {
        return a + b + c;
    }
}
