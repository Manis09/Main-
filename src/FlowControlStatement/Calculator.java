package FlowControlStatement;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println("To perform addition press 1");
        System.out.println("To perform subtraction press 2");
        System.out.println("To perform multiplication press 3");
        System.out.println("To perform division press 4");
        System.out.println("To perform all operations press 5");
        int choice =scan.nextInt();
        if (choice == 1 )
        {
          System.out.println("The addition is "+add);
        }
        if (choice == 2)
        {
            System.out.println("The subtraction is "+sub);
        }
        if (choice == 3 )
        {
            System.out.println("The multiplication is "+mul);
        }
        if (choice == 4 )
        {
            System.out.println("The division is "+div);
        }
        if (choice == 5 )
        {
            System.out.println("The addition is "+add);
            System.out.println("The subtraction is "+sub);
            System.out.println("The multiplication is "+mul);
            System.out.println("The division is "+div);
        }
    }
}