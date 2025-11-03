package Array;

public class FindOddEvenInArray {
    public static void main(String[] args) {
        int arr[] = {28,33,44,50,20,2,10,97};
        System.out.println("The even number is=>");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }

    }
}
