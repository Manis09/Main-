package FlowControlStatement;

import java.util.Scanner;

//WAP to check given numbers are equal or not
public class numberCase3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = scan.nextInt();
        System.out.println("Please enter Second number");
        int b = scan.nextInt();
        if(a==b)
        {
        System.out.println("Both Numbers are equal");
        }
        else
        {
            System.out.println("Both Numbers are not equal");
        }
    }
}
