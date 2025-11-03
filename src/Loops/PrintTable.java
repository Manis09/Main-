package Loops;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        System.out.println("Please enter a number for table");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("The table of number "+num+" is");
        for(int i= 1;i<=10;i++)
        {
            System.out.println(num*i);
        }
    }
}
