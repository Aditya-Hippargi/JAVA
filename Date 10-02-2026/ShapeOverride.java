class Shape{
    void perimeter(){
        System.out.println("Shape Perimeter");
    }
}

class Square extends Shape{
    @Override
    void perimeter(){
        System.out.println("Square Perimeter");
    }
}
class Circle extends Shape{
    @Override
    void perimeter(){
        System.out.println("Circle Perimeter");
    }
}

public class ShapeOverride {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Square();
        Shape s3 = new Circle();

        s1.perimeter();
        s2.perimeter();
        s3.perimeter();
    }
}
