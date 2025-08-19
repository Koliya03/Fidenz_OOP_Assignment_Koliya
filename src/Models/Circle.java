package src.Models;

public class Circle implements Shape {
    private final double radius;
    private final double thickness;

    public Circle(double radius, double thickness) {
        if (radius <= 0)
            throw new IllegalArgumentException("radius can not be negative or null");
        if (thickness < 0)
            throw new IllegalArgumentException("thickness can not be negative");
        this.radius = radius;
        this.thickness = thickness;
    }

    @Override
    public double areaWithoutBorder() {
        return Math.PI * radius * radius;
    }

    @Override
    public double areaIncludingBorder() {
        double R = radius + thickness;
        return Math.PI * R * R;
    }

    @Override
    public double borderArea() {
        return areaIncludingBorder() - areaWithoutBorder();
    }
}
