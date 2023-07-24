import java.util.Scanner;

public class Exercise11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for side1: ");
        double side1 = input.nextDouble();
        System.out.println("Enter the value for side2: ");
        double side2 = input.nextDouble();
        System.out.println("Enter the value for side3: ");
        double side3 = input.nextDouble();

        System.out.println("Enter the color of the triangle: ");
        String color = input.next();

        System.out.println("Is the triangle filled? (true or false): ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println("The triangle was created on: " + triangle.getDateCreated());
        System.out.println(triangle.toString());
        System.out.println("The Triangle's Area is " + triangle.getArea());
        System.out.println("The Triangle's Perimeter is " + triangle.getPerimeter());
        System.out.println("The Triangle's Color is " + triangle.getColor());
        System.out.println("Is the Triangle filled? " + triangle.isFilled());
    }
}