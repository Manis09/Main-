package Array;
// Program to print the array elements
public class Intro {
    public static void main(String[] args) {
        int[] x = {50, 20, 30, 40 ,10};
        for (int i = 0; i < x.length; i++) {
            for(int j=0;j<x.length;j++){
               if(x[i]<x[j]) {
                   int temp=x[i];
                   x[i]=x[j];
                   x[j]=temp;
               }
        }
        }
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]+" ");
        }
        }
    }
