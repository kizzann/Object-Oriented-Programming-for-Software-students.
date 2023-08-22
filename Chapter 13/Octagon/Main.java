public class Main {
    public static void main(String[] args) {

        Octagon octagon = new Octagon(5);
        System.out.println("Octagon 1: " + octagon);

        System.out.println("The area of the Octagon is: " + octagon.getArea());


        Octagon secondOctagon = (Octagon) octagon.clone();
        System.out.println("Octagon 2: " + secondOctagon);

        System.out.println(octagon.compareTo(secondOctagon));



    }
}
