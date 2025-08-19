public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        Shape circle = new Circle(10, 2);
        Shape rect = new Rectangle(5, 8, 1);
        Shape square = new Square(6, 0);

        canvas.addElement(circle);
        canvas.addElement(rect);
        canvas.addElement(square);

        System.out.println("Total core area: " + canvas.totalAreaWithoutBorders());
        System.out.println("Total border area: " + canvas.totalBordersOnly());
        System.out.println("Total including borders: " + canvas.totalIncludingBorders());
    }
}
