package Datatype;

public class Program01 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println(a+b);
        String s1=Integer.toString(a);
        String s2=Integer.toString(b);
        String s3=s1+s2;
        int c =Integer.parseInt(s3);
        System.out.println(c);
    }
}
