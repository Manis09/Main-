package FlowControlStatement;

import java.util.Scanner;

public class numberCase1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second  number");
        int b = scan.nextInt();
        System.out.println("Enter third number");
        int c = scan.nextInt();
        if(a>b && a>c)
        {
            System.out.println("The greter number is "+a);
        }
        if(b>a && b>c)
        {
            System.out.println("The greter number is "+b);
        }
        if(c>b && c>a)
        {
            System.out.println("The greter number is "+c);
        }
    }
}
