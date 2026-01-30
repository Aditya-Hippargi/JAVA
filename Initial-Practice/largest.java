public class largest {
    static int large(int a,int b,int c){
        if(a>=b && a>=c) return a;
        else if(b>=c) return b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(large(10,20,30));
    }
}
