public class class2 {
    static String a= "10";
    public static void main(String[] args) {
        System.out.println(a);
        int b=Integer.parseInt(a);

        System.out.println(b);

        char c='a'+10;
        int x=(int)c+10;
        c=(char)x;
        System.out.println(x);
        System.out.println(c);
    }
}