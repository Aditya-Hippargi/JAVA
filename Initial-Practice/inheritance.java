class Animal {
    void eat(){
        System.out.println("Eat");
    }
    void sleep(){
        System.out.println("Sleep");
    }
    void play(){
        System.out.println("Play");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Bark");
    }
}
class GermanShephard extends Dog{
    void myself(){
        System.out.println("German Shephard");
    }
}

public class inheritance {
    public static void main(String[] args) {
        GermanShephard d=new GermanShephard();
        d.eat();
        d.bark();
        d.sleep();
        d.play();
        d.myself();
    }
}
