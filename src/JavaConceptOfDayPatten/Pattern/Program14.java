package JavaConceptOfDayPatten.Pattern;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
//Number Patterns
public class Program14 {
      public static void pattern1(){
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the  number of rows");
          int row= scan.nextInt();
          for(int i=1;i<=row;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(j+" ");
             }
              System.out.println();
          }
      }
      public static void pattern2(){
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter the  number of rows");
          int row= scan.nextInt();
          for(int i=row;i>=1;i--){
              for(int j=1;j<=i;j++){
                  System.out.print(j+" ");
              }
              System.out.println();
          }
      }
      //This method use for two pattern .
      public static void pattern3(){
          Scanner scan=new Scanner(System.in);
          System.out.println("Enetr no of rows");
          int row= scan.nextInt();
          //for number of rows
          for(int i=1;i<=row;i++){
              //for space
              for(int j=row;j>=i;j--){
                  System.out.print(" ");
              }
              for(int k=1;k<=i;k++){
                  System.out.print(k);//by adding space its convert in Pyramid
              }
              System.out.println();
          }
      }
      public static void pattern4(){
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter the number of rows");
          int row= scan.nextInt();
          for(int i=row;i>=1;i--){
              for(int j=1;j<=i;j++){
                  System.out.print(j+" ");
              }
              System.out.println();
          }
          for(int i=2;i<=row;i++){
              for(int j=1;j<=i;j++){
                  System.out.print(j+" ");
              }
              System.out.println();
          }
      }
      public static void pattern5() {
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter no of rows");
          int row = scan.nextInt();
          int space = 1;
          for (int i = row; i >= 1; i--) {
              for (int j = 1; j <= space; j++) {
                  System.out.print(" ");
              }
              for (int k = 1; k <= i; k++) {
                  System.out.print(k + " ");
              }
              System.out.println();
              space++;
          }
          for (int i = 2; i <= row; i++) {
              for (int j=row;j>=i;j--) {
                  System.out.print(" ");
              }
              for (int k = 1; k <= i; k++) {
                      System.out.print(k+" ");
                  }
                  System.out.println();
              }
          }
          public static void pattern6(){
          Scanner scan = new Scanner(System.in);
              System.out.println("Enter the number of rows");
              int row= scan.nextInt();
              for(int i=1;i<=row;i++){
                  for(int j=1;j<=i;j++){
                      System.out.print(j+" ");
                  }
                  System.out.println();
              }
              for(int i=row-1;i>=1;i--){
                  for(int j=1;j<=i;j++){
                      System.out.print(j+" ");
                  }
                  System.out.println();
              }
          }
public static void pattern7(){
          Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of rows");
          int row= scan.nextInt();
          int num=row-1;
          for(int i=1;i<=row;i++){
              for(int j=row;j>=i;j--){
                  System.out.print(" ");
              }
              for(int k=1;k<=i;k++){
                  System.out.print(k+" ");
              }
              System.out.println();
          }
          for(int i=1;i<=row-1;i++){
              for(int j=1;j<=i;j++){
                  System.out.print(" ");
              }
              for(int k=1;k<=num;k++){
                  System.out.print(" "+k);
              }
              System.out.println();
              num--;
          }
}
public static void pattern8() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int row = scan.nextInt();
    int num = 1;
    for (int i = 1; i <= row; i++) {
        for (int j = row; j >= i; j--) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2*i-1; k++) {
             if(k<=i){
                 num=k;
                 System.out.print(num);
             }else{
                 --num;
                 System.out.print(num);
             }
        }
        System.out.println();
    }
}
public static void pattern9(){
          Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int num= scan.nextInt();
    for(int i=1;i<=num;i++){
        for(int j=1;j<=2*i-1;j++){
            if(j==i){
                System.out.print(j);
            }else{
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
public static void pattern10(){
          Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int row=scan.nextInt();
    for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int k=row-1;k>=i;k--){
            System.out.print("*");
        }
        System.out.println();
    }
}
//pattern11
//        1
//        1*3
//        1*3*5
//        1*3*5*7
//        1*3*5*7*9
//        1*3*5*7*9*11
//        1*3*5*7*9*11*13

    public static void pattern11(){
          Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int row= scan.nextInt();
    for(int i=1;i<=row;i++){
        for(int j=1;j<=2*i-1;j++){
            if(j%2==0){
                System.out.print("*");
            }
            else{
                System.out.print(j);
            }
        }
        System.out.println();
    }
}
//pattern12
//            1
//            1*2
//            1*2*3
//            1*2*3*4
//            1*2*3*4*5
//            1*2*3*4*5*6
//            1*2*3*4*5*6*7
    public static void pattern12(){
          Scanner scan=new Scanner(System.in);
        System.out.println("Enter the row number");
        int row= scan.nextInt();
        int num=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=2*i-1;j++){
                if(j%2==0){
                    System.out.print("*");
                }else{
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
            num=1;
        }

    }
//        10101
//        01010
//        10101
//        01010
//        10101
    public static void pattern13(){
      Scanner scan=new Scanner(System.in);
      int row= scan.nextInt();
      for(int i=1;i<=row;i++){
          for(int j=1;j<=row;j++){
              if(i%2!=0){
                  if(j%2==0){
                      System.out.print("0");
                  }else{
                      System.out.print("1");
                  }
              }else{
                  if(j%2==0){
                      System.out.print("1");
                  }else{
                      System.out.print("0");
                  }
              }
          }
          System.out.println();
      }
    }
//            0000000
//            0100000
//            0020000
//            0003000
//            0000400
//            0000050
//            0000006
    public static void pattern14(){
          Scanner scan=new Scanner(System.in);
          int row=scan.nextInt();
          int num=0;
          for(int i=1;i<=row;i++){
              for(int j=1;j<=row;j++){
                  if(i==j){
                      System.out.print(num);
                      num++;
                  }else{
                      System.out.print("0");
                  }
              }
              System.out.println();
          }
    }
//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
    public static void pattern15(){
          Scanner scan=new Scanner(System.in);
        System.out.println("Enter the row number");
        int row= scan.nextInt();
        for(int i=1;i<=row;i++){
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+row-j;
            }
            System.out.println();

        }
    }
//            1
//            2 3
//            4 5 6
//            7 8 9 10
//            11 12 13 14 15
    public static void pattern16(){
          Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=scan.nextInt();
        int num=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    num=num+i;
                    num--;
                    System.out.print(num+" ");
                }else{
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
//        1111111
//        1111122
//        1111333
//        1114444
//        1155555
//        1666666
//        7777777
    public static void pattern17(){
          Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int row= scan.nextInt();
        int num=1;
        for(int i=1;i<=row;i++){
            for(int j=row-1;j>=i;j--){
                System.out.print(num);
            }
            for(int k=1;k<=i;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
//            1 2 3 4
//            5 6 7
//            8 9
//            10
    public static void pattern18(){
        int num=1;
          for(int i=4;i>=1;i--){
              for(int j=1;j<=i;j++){
                  System.out.print(num+" ");
                  num++;
              }
              System.out.println();
          }
    }
//1
//3 2
//4 5 6
//10 9 8 7
//11 12 13 14 15
    public static void pattern19() {
        int num =1;
        for (int i = 1; i <= 5; i++) {
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(num+" ");
                    num++;
                }else{
                    System.out.print(num+" ");
                    num--;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        //pattern3();
        //pattern4();

        //pattern5();
        //pattern6();
        //pattern7();
        //pattern8();
        //pattern9();
        //pattern10();
        //pattern11();
        //pattern12();
        //pattern13();
        //pattern14();
        //pattern15();
        //pattern16();
        //pattern17();
        //pattern18();
        pattern19();
    }
}
