class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}
class Tiger extends Animal{
    void eat(){
        super.eat();
        System.out.println("Tiger eats");
    }
}

public class AnimalSuper {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        t.eat();
    }
}
