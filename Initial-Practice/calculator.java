import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int x, y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x: ");
        x=sc.nextInt();

        System.out.print("Enter y: ");
        y=sc.nextInt();

        System.out.println("@ Main Menu @");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice=sc.nextInt();
        switch(choice){
            case 1: System.out.println("Add: "+(x+y));break;
            case 2: System.out.println("Sub: "+(x-y));break;
            case 3: System.out.println("Mul: "+(x*y));break;
            case 4: if(y!=0) System.out.println("Div: "+(x/y));
                    else System.out.println("Div: "+x);
                    break;
        }
    }
}
