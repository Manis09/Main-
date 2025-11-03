package Variable;
import java.util.Scanner;
class Solution1{
    protected void msg(){
        System.out.println("Hello");
    }
}
public class Solution extends Solution1{
     public void msg(){

    }
    public void printNumber(Scanner sc) {
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution solve = new Solution();
        solve.printNumber(scan);

    }
}
