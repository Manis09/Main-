package Array;

import java.util.Scanner;

class Array{
    private int arr[];
    int length;
    public Array(){
        System.out.println("Enter the size of array");
        Scanner scan=new Scanner(System.in);

        arr=new int[scan.nextInt()];
        length=arr.length;
        System.out.println("Array is created of size:: "+arr.length);
    }
    public Array(int size){
        arr=new int[size];
        length=size;
        System.out.println("Array is created of sze:: "+size);
    }

    public void insert(int index,int value){
        if(index>=0 && index<=arr.length-1){
            arr[index]=value;
        }else{
            System.out.println("Enter the valid index from 0 to :: "+(arr.length-1));
        }
    }

    public void update(int index,int value){
        if(index>=0 && index<= arr.length-1){
            arr[index]=value;
            System.out.println("Element "+arr[index] +" is inserted on index "+ index);
        }else{
            System.out.println("Enter the valid index from 0 to :: "+(arr.length-1));
        }
    }

    public void delete(int index){
        if(index>=0 && index<=arr.length-1){
            arr[index]=0;
        }else{
            System.out.println("Enter the valid index from 0 to :: "+(arr.length-1));
        }
    }

    public void display(){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("Array element present on index "+ i +" is-->"+arr[i]);
        }
    }



}
public class ArrayCreation {
    public static void main(String[] args) {
        Array obj=new Array(5);
        obj.insert(2,200);
        obj.display();

        obj.update(2,100);
        obj.display();
    }
}
