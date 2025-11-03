package Datatype;

public class SwapString {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 ="Programming";
        System.out.println("Before Swapping:"+ str1 +" "+ str2);
        String temp;
        temp = str1;
        str1=str2;
        System.out.println("After Swapping:"+ str1 +" "+temp);
    }
}
