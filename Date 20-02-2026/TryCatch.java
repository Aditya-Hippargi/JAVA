public class TryCatch {
    public static void main(String[] args){
        try {
            int res=10/0;            
        } catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage().replace("/", "Division"));
        }

        try {
            String str=null;      
            System.out.println(str.length());      
        }catch (NullPointerException e){
            System.out.println("Error: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        try {
            String str = "123a";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
