public class Main{
    int x=5;
    public static void main(String[] args){
        Main myObj=new Main();
        System.out.println(myObj.x);

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
};