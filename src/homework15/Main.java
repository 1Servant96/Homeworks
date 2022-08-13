package homework15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Circle circle = new Circle();
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the radius for a circle:");
double radius = scanner.nextDouble();
    circle.setRadius(radius);
        System.out.println("Area: "+Math.round(circle.getArea()));
        System.out.println("Circumference: "+Math.round(circle.getCircumference()));

    }


}
