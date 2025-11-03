package Abstraction;
//I can use all access modifiers with instance variable and static also,It is not necessary to provide the value to it.
abstract class Abs extends ABss{
    static int a;
     Abs(int num){
         a=num;
     }
     static {
         System.out.println("Static block");
     }
    {
        System.out.println("Instance block");
    }
    static void printMsg(){

    };
    private void msg(){
        System.out.println("Hello private");
    };
}
class Absc extends Abs{
    Absc(){
        super(10);
    }
}
class ABss{
    void pay(){
        System.out.println("Make payment");
    }
}
public class Abstraction1 {
    public static void main(String[] args) {
        Absc ab = new Absc();
        System.out.println(Abs.a);
        ab.printMsg();
    }
}
