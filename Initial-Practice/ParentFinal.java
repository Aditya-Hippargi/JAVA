final class ParentF{
    void display(){
        System.out.println("Parent Class");
    }
}

class Parent{
    final void display(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    
}
public class ParentFinal {
    public static void main(String[] args) {
        Child c=new Child();
        c.display();

        ParentF p=new ParentF();
        p.display();
    }
}
