package Factory_pattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape Triangolo = factory.creatShape(ShapeType.TRIANGOLO);
        if (Triangolo != null) {
            Triangolo.draw();
        } else {
            System.out.println("Invalid shape type");
        }

        Shape Rettangolo = factory.creatShape(ShapeType.RETTANGOLO);
        if (Rettangolo != null) {
            Rettangolo.draw();
        } else {
            System.out.println("Invalid shape type");
        }
    }
}
