public class loop {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<=n;i++){
            System.out.print(i+" ");
        }
        while(n!=0){
            System.out.print(n+" ");
            n--;
        }
        n=5;
        do { 
            System.out.println(n);
            n--;
        } while (n!=0);
    }
}
