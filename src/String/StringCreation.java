package String;

public class StringCreation {
    public static void main(String[] args) {

        String str1=new String("Hello");
        System.out.println(System.identityHashCode(str1));
        String str2=str1.intern();
        System.out.println(System.identityHashCode(str2));

        System.out.println(str1==str2);

    }
}
