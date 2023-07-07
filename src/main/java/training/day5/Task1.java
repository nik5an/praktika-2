package training.day5;

public class Task1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 5);
        Triangle triangle = new Triangle(3, 4, 5, 3);

        System.out.println("Rect: " + rect.calculateArea() + ", " + rect.calculatePerimeter());
        System.out.println("Triangle: " + triangle.calculateArea() + ", " + triangle.calculatePerimeter());
    }
}
