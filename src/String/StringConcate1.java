package String;

public class StringConcate1 {
    public static void main(String[] args) {
        String s1="Hello";
        s1.concat("java");
        System.out.println(s1);  // Hello
        String s2=s1.concat(" java");
        System.out.println(s2);  //Hello java
    }

}
