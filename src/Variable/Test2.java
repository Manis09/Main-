package Variable;
class T{
    int x=10;
    static int y;
    T(){
        System.out.println("Constructor");
    }
    static {

        System.out.println("From static block:--"+y);
    }
    static void m(){
        y=30;
        System.out.println(y);
    }
    {
        System.out.println("From instance block");
        y=10;
        System.out.println(x);
        System.out.println(y);
    }
    void value(){
        x=20;
        System.out.println(x);
        System.out.println(y);
    }
}
public class Test2 {
    public static void main(String[] args) {
        T t= new T();
        t.value();
        T.m();
    }
}
