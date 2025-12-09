package Datatype;

public class methodCreation {
    long addition(long a,long b)
    {

        return a+b;
    }
    int sub(int a,int b)
    {
        return b-a;
    }
    void mul(int a,int b)
    {
        int m =a*b;
        System.out.println("The multiplication"+m);
    }
    void div()
    {
        System.out.println("a"+'a');
    }
    public static void main(String[] args) {
     methodCreation calc = new methodCreation();
     System.out.println("The addition is: "+calc.addition(2500,3000));
     System.out.println("The subtraction is: "+calc.sub(2560,3001));
     int sub1= calc.sub(50,100);
     System.out.println(sub1);
     calc.mul(5,250);
     calc.div();
        System.out.println("a"+(int)'a');
    }
}

