package Loops;

import java.util.Scanner;
// Program to print fibonacci series
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for series want");
        int input= scan.nextInt();
        int num1=0,num2=1;
        int num3;
        System.out.print(num1+" "+num2);
        for(int i=2;i<=input;i++){
                 num3=num1+num2;
            System.out.println(" "+num3);
            num1=num2;
            num2=num3;
            }
        }

    }

