package JavaConceptOfDayPatten.Pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int row = scan.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=row;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
