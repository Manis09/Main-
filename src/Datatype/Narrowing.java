package Datatype;

import java.util.Scanner;
// To print UTF value of character
public class Narrowing {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char character=scan.next().charAt(0);
        int utfValue = (int)character;
        System.out.println("UTF value is: "+utfValue);
    }
}
