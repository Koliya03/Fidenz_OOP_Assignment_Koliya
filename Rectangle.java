public class Rectangle implements Shape {
    private final double width, height;
    private final double thickness;

    public Rectangle(double width, double height, double thickness) {
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException("Width or height can only be an integer");
        if (thickness < 0)
            throw new IllegalArgumentException("thickness can not be negative");
        this.width = width;
        this.height = height;
        this.thickness = thickness;
    }

    @Override
    public double areaWithoutBorder() {
        return width * height;
    }

    @Override
    public double areaIncludingBorder() {
        return (width + (2 * thickness)) * (height + (2 * thickness));
    }

    @Override
    public double borderArea() {
        return areaIncludingBorder() - areaWithoutBorder();
    }
}
