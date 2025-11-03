package Array;
// Program for searching an element in array by taking user input.
import java.util.Scanner;

public class SerchAnElement {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            //for storing value in array from user input
            a[i]=scan.nextInt();
        }
        // for printing array elements
        for(int i= 0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the number to find the index");
        int x= scan.nextInt();
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==x)
            {
                System.out.println("The given number at index:-"+i);
            }
        }
    }
}
