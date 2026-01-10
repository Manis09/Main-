package String;

public class ReverseCharArray {
    public static void main(String[] args) {
        char[] a={'h','e','l','l','o'};

         int mid=a.length/2;

        for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();

         for(int i=0;i<=mid;i++){
             char temp=a[i];
             a[i]=a[a.length-i-1];
             a[a.length-i-1]=temp;
         }

        for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }

    }
}
