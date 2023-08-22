import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GeometricObject[] geometricObjects = {new Triangle(4,5,6), new Triangle(1,3,7), new Triangle(4,4,6), new Triangle(6,7,8), new Triangle(4,6,8)};

        for(int i = 0; i < geometricObjects.length; i++) {
            System.out.println("Triangle # " + (i + 1));
            System.out.println("Area: " + geometricObjects[i].getArea());
            System.out.println("How to color: " + (geometricObjects[i].howToColor()));
        }
    }
}
