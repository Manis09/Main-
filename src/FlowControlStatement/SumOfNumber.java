package FlowControlStatement;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("The sum of number is"+ sum);
    }
}
