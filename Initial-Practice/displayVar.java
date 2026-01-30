public class displayVar {
    public static void main(String[] args) {
        String fName="SIT ";
        String iName="College";

        String fullName=fName+iName;
        System.out.println(fullName);

        int x=5, y=6;
        System.out.println(x+y);
        int a=66, b=45, c=6;
        System.out.println(a+b+c);

        String studentName="XYZ";
        int studentID=15;
        int studentAge=23;
        float studentFee=75.25f;
        char studentGrade='B';

        System.out.println("Student Name: "+studentName);
        System.out.println("Student ID: "+studentID);
        System.out.println("Student age: "+studentAge);
        System.out.println("Student fees: "+studentFee);
        System.out.println("StudentGrade: "+studentGrade);

        int l=4;
        int w=6;
        int area=l*w;
        System.out.println("Length: "+l);
        System.out.println("Width: "+w);
        System.out.println("Area: "+area);

        double d=9.78d;
        int i=(int)d;
        System.out.println(d);
        System.out.println(i);

        int p=5;
        System.out.println(++p);
        System.out.println(p);
        System.out.println(p++);

        x=5; y=3;
        System.out.println(x<=y);

        a=60; b=13;
        c=a&b;

        System.out.println(c);

        c=a|b;
        System.out.println(c);
    }
}
