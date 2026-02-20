import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String str = " Java, Python, C++, JavaScript, Pokemon";
        StringTokenizer st = new StringTokenizer(str," ");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }    
}
