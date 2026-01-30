public class constructor {
    String name;int rollNO;
    public constructor() {
        name="Aditya";
        rollNO=10;
    }
    public constructor(int x){
        name="Aditya";
        rollNO=x;
    }
    public constructor(String n,int x){
        name=n;
        rollNO=x;
    }
    void display(){
        System.out.println(name+", Roll No.: "+rollNO);

    }
    
    public static void main(String[] args){
        constructor ct=new constructor(12);
        ct.display();
    }
}
