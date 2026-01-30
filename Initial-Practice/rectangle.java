import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter legth: ");
        int l=sc.nextInt();

        System.out.println("Enter breadth: ");
        int b=sc.nextInt();

        int area=l*b;
        System.out.println("Area is: "+area);
    }
}

