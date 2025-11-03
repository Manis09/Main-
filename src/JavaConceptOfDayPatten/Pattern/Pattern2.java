package JavaConceptOfDayPatten.Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int row= scan.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}