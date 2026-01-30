class Parent{
    void display(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child");
    }
}

class Child1 extends Child{
    void show1(){
        System.out.println("Child1");
    }
}

public class ParentClass {
    public static void main(String[] args){
        Child1 c=new Child1();
        c.display();
        c.show();
        c.show1();
    }
}
