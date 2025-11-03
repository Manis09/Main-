package FlowControlStatement;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        int count=1;
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        while(num/10!=0){
            int c=num/10;
            num=c;
            count++;
        }
        System.out.println(count);
    }
}
