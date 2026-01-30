public class Main2{
    public static void main(String[] args) {
        new Demo();
    }
}
class Demo {
    Demo(){
        this("Default Constructor");
    }
    Demo(String message){
        System.out.println(message);
    }
}
