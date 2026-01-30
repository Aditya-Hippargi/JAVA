public class student {
    String name;
    int age;
    student(){
        name="XYZ";
        age=18;
    }
    void display(){
        System.out.println("Name: "+name+", Age: "+age);
    }

    public static void main(String[] args) {
        student s=new student();
        s.display();
    }
}
