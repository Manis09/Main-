package Loops;

import java.util.Scanner;

public class WhileLoopIntro {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count=0;
        if(num==0){
            count=1;
            System.out.println(count);
        }else {
            while(num !=0){
                num=num/10;
                count++;
            }
            System.out.println(count);
        }

        }
    }
