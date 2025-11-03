package FlowControlStatement;

import java.util.Scanner;

public class checkNumberGreater {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter first number");
        int a=scan.nextInt();
        System.out.println("Please enter Second number");
        int b= scan.nextInt();
        if(a>b)
        {
            System.out.println("The Greater number is "+a);
        }
        else
        {
          System.out.println("The Greater number is "+b);
        }
    }
}
