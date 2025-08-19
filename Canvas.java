import java.util.*;

public class Canvas {
    private List<Shape> shapes = new ArrayList<>();

    public void addElement(Shape s) {
        if (s == null)
            throw new IllegalArgumentException("Shape cannot be null");
        shapes.add(s);
    }

    public double totalAreaWithoutBorders() {
        double sum = 0.0;
        for (Shape element : shapes) {
            sum += element.areaWithoutBorder();
        }
        return sum;
    }

    public double totalIncludingBorders() {
        double sum = 0.0;
        for (Shape element : shapes) {
            sum += element.areaIncludingBorder();
        }
        return sum;
    }

    public double totalBordersOnly() {
        double sum = 0.0;
        for (Shape element : shapes) {
            sum += element.borderArea();
        }
        return sum;
    }
}
