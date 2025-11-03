package FlowControlStatement;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNumber = scan.nextInt();
        for(int i=1;i<=maxNumber;i++)
        {
            if(i%2 !=0)
            {
                System.out.println(i);
            }
        }
    }
}
