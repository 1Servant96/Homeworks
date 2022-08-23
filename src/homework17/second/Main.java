package homework17.second;

public class Main {
    public static void main(String[] args) {
Triangle triangle = new Triangle(8,2,6);
Square square = new Square(2,2,2,2);
Circle circle = new Circle(6);
Rectangle rectangle = new Rectangle(5,3,5,3);
Romb romb = new Romb(5,5,5,5);
        System.out.println("--------Perimeters--------");
        System.out.println("Triangle = " + triangle.getPerimeter());
        System.out.println("Square = " + square.getPerimeter());
        System.out.println("Circle = "+circle.getPerimeter());
        System.out.println("Romb = "+romb.getPerimeter());
        System.out.println("Rectangle = "+rectangle.getPerimeter());
    }
}
