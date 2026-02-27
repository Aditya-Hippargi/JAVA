class SuperClass{
    void method(){
        System.out.println("SuperClass method executed");
    }
}
class SubClass extends SuperClass{
    @Override
    void method() throws ArithmeticException{
        System.out.println("SubClass method Execution");
        throw new ArithmeticException("Exception in Subclass");
    }
}
public class EXCP3 {
    public static void main(String[] args) {
        SuperClass s = new SubClass();
        try {
            s.method();
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: "+e);
        }   
    }    
}
