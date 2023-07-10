class GetRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3.5, 35.9);
        System.out.println("The area of rectangle1 with a height of " + rectangle1.height + " and a width of " + rectangle1.width +" is " + rectangle1.getArea() + " and the perimeter is " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(4, 40);
        System.out.println("The area of rectangle2 with a height of " + rectangle2.height + " and a width of " + rectangle2.width + " is " + rectangle2.getArea() + " and the perimeter is " + rectangle2.getPerimeter());
    }
    static class Rectangle {
        double height;
        double width;

        Rectangle() {
            height = 1;
            width = 1;

        }

        Rectangle(double newHeight, double newWidth) {
            height = newHeight;
            width = newWidth;
        }

        double getArea() {
            return height * width;
        }
        double getPerimeter() {
            return (width * 2) + (height * 2);
        }
    }
}
