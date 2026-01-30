class Parent{
    Parent(){
        System.out.println("Parent Class Constructor");
    }
}
class Child extends Parent{
    Child(){
        super();System.out.println("Child Class Constructor");
    }
}

public class Main3 {
    public static void main(String[] args) {
        new Child();
    }
}
