class Exception{
    
}
public class Main {
    static void func(){
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught inside func().");
            throw e;
        }
    }
    public static void main(String[] args){
        try{
            func();
        }catch(NullPointerException e){
            System.out.println("Caught in main.");
        }
    }
}
