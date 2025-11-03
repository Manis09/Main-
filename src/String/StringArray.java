package String;

public class StringArray {
    public static void main(String[] args) {
        String str1="Hello Java!";
        String str =new String("Hello Java!");
        String str2=str.intern();
        System.out.println(str1==str2);
        System.out.println();

    }

}