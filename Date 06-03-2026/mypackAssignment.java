public class mypackAssignment {
    public int i=0;
    private int j=10;
    int k=123;
    protected int l=55;
    
    void display(){
        System.out.println(i+", "+j+", "+k);
    }    
    public static void main(String[] args) {
        mypackAssignment m1= new mypackAssignment();
        m1.display();
    }
}
