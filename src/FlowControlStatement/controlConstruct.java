package FlowControlStatement;

import java.util.Scanner;

public class controlConstruct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a =scan.nextInt();
      if(a%2==0)
        {
            System.out.println("The Given no is even ");

        }
      else
      {
          System.out.print("The given number is odd");
      }
    }
}
