public class GeometricObject implements Colorable {
    private String color;
    private boolean filled;
    private final java.util.Date dateCreated;



    GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

     void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return super.toString();
    }

    public double getArea() {
        return getArea();
    }

    public String howToColor() {
        return "Color all three sides!";
    }
}
