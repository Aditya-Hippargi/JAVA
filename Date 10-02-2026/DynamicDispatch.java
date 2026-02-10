class Parent{
    void show(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    @Override
    void show(){
        System.out.println("Child method");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}