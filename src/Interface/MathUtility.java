package Interface;

public interface MathUtility {
     static void cube(int n){
         int num=n*n*n;
         System.out.println(num);
    }
    public static void main(String[] args){
         MathUtility.cube(5);
    }
}
