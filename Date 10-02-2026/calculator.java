class Calculator{
    int add(int x,int y){
        return x+y;
    }
    double add(double x,double y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }

    int sub(int x,int y){
        return x-y;
    }
    double sub(double x,double y){
        return x-y;
    }
    int sub(int x,int y,int z){
        return x-y-z;
    }

    int div(int x,int y){
        if(y==0) return x;
        return x/y;
    }
    double div(double x,double y){
        if(y==0) return x;
        return x+y;
    }

    int mul(int x,int y){
        return x/y;
    }
    double mul(double x,double y){
        return x*y;
    }
}

public class calculator {
    public static void main(String[] args){
        Calculator cal=new Calculator();
        System.out.println(cal.add(1,2));
        System.out.println(cal.add(1.314089,2.680383));
        System.out.println(cal.add(1,2,3));
    }
}
