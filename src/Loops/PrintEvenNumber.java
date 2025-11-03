package Loops;

import java.util.Scanner;

public class PrintEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give the number to print even numbers to that");
        int num=scan.nextInt();
        System.out.println("Even numbers are");
        for(int i=0;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
