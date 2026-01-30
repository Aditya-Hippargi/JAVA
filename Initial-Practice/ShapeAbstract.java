abstract class Shape{
    abstract void draw();
    void message(){
        System.out.println("Shape Class");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle Class");
    }
}
public class ShapeAbstract {
    public static void main(String[] args) {
        Shape s=new Circle();
        s.draw();
    }
}
