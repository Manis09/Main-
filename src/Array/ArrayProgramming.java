package Array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayProgramming {
    //Program1:---->Store and Print Elements of array
    public static void printArray() {
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element at" + i + "index: ");
            arr[i] = scan.nextInt();
        }
        System.out.println("The integer array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The element at index" + i + "is: " + arr[i]);
        }
    }

    //Program1:---->Sum of array elements
    public static void sumOfArray() {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("The array elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The array is:--" + arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of array is:--" + sum);
    }

    //Find minimum and maximum element in array
    public static void smallLargest() {
        int[] arr = {5, 4, 1, 3, 2, 6};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The max number in array is:--" + max);
        System.out.println("The min number in array is:--" + min);
    }

    //Search an Element in Array
    public static void searchAnElement() {
        int[] arr = {10, 20, 30, 40, 60};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an element to search in array");
        int num = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("The number " + num + " is present in index " + i);
                return;
            }
        }
        System.out.println("The element not present");
    }

    //Count Even and Odd Numbers in Array
    public static void evenOddInArray() {
        int[] arr = {10, 20, 31, 40, 60};
        int count1 = 0; // for even number
        int count2 = 0; // for odd number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count1++;
            } else {
                count2++;
            }

        }
        if (count1 > 0) {
            System.out.println("The even numbers present in array is " + count1);
        } else {
            System.out.println("The even number is not present in array");
        }
        if (count2 > 0) {
            System.out.println("The odd numbers present in array is " + count2);
        } else {
            System.out.println("The odd number is not present in array");
        }
    }

    //Ascending& Desanding order in array
    public static void ascendingElement() {
        int[] arr = {10, 20, 31, 40, 60};
        int temp = 0;
        System.out.println("The array elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("================");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray() {
        int[] arr = {10, 20, 31, 40, 60, 80};
        int temp = 0;
        System.out.println("The array elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The array element in index " + i + "is " + arr[i]);
        }
        System.out.println("================");
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The array element in index " + i + "is " + arr[i]);
        }
    }

    public static void secondLargest() {
        int[] arr = {51, 53, 55, 42, 90};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int max2=arr[0];
        for(int i=1;i< arr.length;i++){
               if(arr[i]==max){
                   continue;
               } else{
                 max2=arr[i];
               }
            }
        System.out.println(max2);
    }

    static void duplicateValue()
        {
            Object[] m = {"Name", 10, 7.25,};
        }
        public static void main (String[]args)
        {
            //printArray();
            //sumOfArray();
            //smallLargest();
            //searchAnElement();
            //evenOddInArray();
            //ascendingElement();
            //reverseArray();
            secondLargest(); //this is not solved
        }
}