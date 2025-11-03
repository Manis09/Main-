package String;

public class CompareString {
    String s1="Hello";
    String s2="Java";
     void compare(){
         System.out.println(s1.equals(s2));
         System.out.println(s1.equalsIgnoreCase(s2));
         System.out.println(s1==s2);
         System.out.println(s1.concat(s2));
         s1.concat(s2);
         System.out.println(s1);
         String s3=s1.concat(s2);
         System.out.println(s3);
     }
    //There are three ways to compare a string
    //1.equals():-By using this method it will check the string original content
    //            in this every character of string checked and give the OP.
    //            in this method every character case is also checked and if not matched OP will false.
    //2.equalsIgnoreCase():-In this method string original content checked but it not check the uppercase and lower case.

    public static void main(String[] args) {
        CompareString cs = new CompareString();
        cs.compare();

    //(== double equals method):- It will not compare between string content it check the reference number(memory address) of object.

    }

}
