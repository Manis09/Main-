package FlowControlStatement;

public class numberSqaure1 {
    public static void main(String[] args) {
        int a=1;
        for(int i=a;i<=10;i++)
        {
            System.out.print("The Sqaure of number "+i+ " is "+ a*a);
            a++;
            System.out.println();
        }
        a = 1;
        for(int i=a;i<=10;i++)
        {
            System.out.print("The cube of number "+i+ " is "+ a*a*a);
            a++;
            System.out.println();
        }

    }
}
