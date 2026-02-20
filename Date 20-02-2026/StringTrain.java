public class StringTrain {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println(str1);
        System.out.println(str2);

        str2 = str1;
        System.out.println(str2);

        System.out.println("Length: " + str1.length());
        System.out.println("Trimmed: "+str1.trim());
        System.out.println("Uppercase: "+str1.toUpperCase());
        System.out.println("Substring(2,6): "+str1.substring(0,3));
        System.out.println("Replace: "+str1.replace("H","O"));

        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append("World");
        System.out.println("After Append: "+buffer);

        buffer.insert(6,"JAVA");
        System.out.println("After Insert: "+buffer);

        buffer.replace(0,5,"Hi");
        System.err.println("After Replace: "+buffer);

        buffer.delete(2,5);
        System.out.println("After Delete: "+buffer);

        
    }    
}
