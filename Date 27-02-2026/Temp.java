
import java.io.IOException;

class Parent{
    void readFile() throws IOException{
        System.out.println("Reading file in parent");
    }
}
class Child extends Parent{
    @Override
    void readFile() throws IOException{
        System.out.println("Reading file in Child");
    }
}

public class Temp {
    public static void main(String[] args) {
        Parent p = new Child();
        
    }    
}
