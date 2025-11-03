package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter the number for factorial");
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        int a=1;
        for(int i=1;i<=num;i++){
              i=a*i;
             }
        }
    }
