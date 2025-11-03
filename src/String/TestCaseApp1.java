package String;
public class TestCaseApp1 {
    public static void main(String[] args) {
        String str1=new String("Manish");
        System.out.println(str1);
        String str2="Manish";
        String str3=str2;
        str3=str3.concat("bhawsar");
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str1==str2);
        System.out.println((str2==str3));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
    }
}
