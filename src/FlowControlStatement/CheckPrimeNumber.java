package FlowControlStatement;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scan.nextInt();
        int count=0;
        for(int i=2;i<=num-1;i++){

                if(num%i==0 ){
                  count++;
                }
            }
        if(count!=0){
            System.out.println("Number is not Prime");
        }
        else{
            System.out.println("Number is prime");
        }
        }
    }
