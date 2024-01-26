package thirdweek.sealedclassandinstanceof;
public sealed class Shape permits Circle, Square{
    private String ShapeName;

    public Shape(String shapeName) {
        ShapeName = shapeName;
    }

    public Shape() {
    }

    public String getShapeName() {
        return ShapeName;
    }
}
final class Circle extends Shape {
    private String circleName;

    public Circle(){
    }

    public Circle(String circleName) {
        this.circleName = circleName;
    }

    public String getCircleName() {
        return circleName;
    }
}

final class Square extends Shape {
    private String squareName;

    public Square(){}

    public Square(String squareName) {
        this.squareName = squareName;
    }

    public String getSquareName() {
        return squareName;
    }
}
