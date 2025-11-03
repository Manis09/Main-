package FlowControlStatement;

import java.util.Scanner;

//WAP to check given number is positive or negative
public class numberCase2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a= scan.nextInt();
        if(a>=0)
        {
            System.out.println("The given number is positive");
        }
        else
        {
            System.out.println("The given number is negitive");
        }
    }
}
