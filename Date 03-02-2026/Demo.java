public class Demo {
    Demo(){
        this(1);
        System.out.println("Default");
    }
    Demo(int x){
        System.out.println("Int Constructor: "+x);
    }
    

    Demo(String message){
        this();
        System.out.println("String Constructor: "+message);
    }
    

    public static void main(String[] args) {
        new Demo();
        new Demo("XYZ");
        new Demo(19);
    }
}
