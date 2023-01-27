package intermediates.generics.wildcards.bounded_wildcards;

public class Rectangle implements Shape {

    private double width;
    private double height;

    @Override
    public double area() {
        return width * height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}
