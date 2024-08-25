public class ShapeTest {
    public void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // Test invalid shapes
        Shape shape = shapeFactory.getShape("SQUARE");
        if (shape != null) {
            System.out.println("Square");
            Square.draw();
            System.out.println();
        }
        Shape Circle = shapeFactory.getShape("CIRCLE");
        if (Circle != null) {
            System.out.println("Circle");
            Circle.draw();
            System.out.println();
        }
        Shape Rectangle = shapeFactory.getShape("RECTANGLE");
        if (Rectangle != null) {
            System.out.println("Rectangle");
            Rectangle.draw();
            System.out.println();
        }
        // Test invalid shape
        Shape invalidShape = shapeFactory.getShape("PENTOGON");
        if (invalidShape !=null) {
            invalidShape.draw();
        }
    }
}
