public class InnerOuter {
    class Inner{
        void display(){
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
        InnerOuter.Inner obj = new InnerOuter().new Inner();
        obj.display();
    }
}
