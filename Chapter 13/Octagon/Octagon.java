public class Octagon extends GeometricObject implements Clone {

    private double side;

    public Octagon() {

        side = 1.0;

}

public Octagon(double side) {
        this.side = side;


}

public double getSide() {
        return side;

}

public double getArea() {

        return  (2 + 4 / (Math.sqrt(2))) * side * side;

}

public String toString() {
        String s;
        s = "Octagon sides are equal in length!";
        return (s);
}





    @Override
    public Clone clone() {
        return new Octagon(side);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}