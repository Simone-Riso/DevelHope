package Factory_pattern;

public class ShapeFactory {
    public Shape creatShape(ShapeType shapeType) {
        return switch (shapeType) {
            case TRIANGOLO -> new Triangolo();
            case RETTANGOLO -> new Rettangolo();
        };
    }
}
