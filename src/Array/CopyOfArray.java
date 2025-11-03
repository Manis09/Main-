package Array;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] array= {10,40,50,60,70,100,90,30,80,20};
        int[] dummy=new int[array.length];
        for(int i=0;i< array.length;i++){
            dummy[i]=array[i];
        }

        for(int i=0;i< dummy.length;i++){
            System.out.print(dummy[i]+" ");
        }
    }
}
