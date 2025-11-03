package Variable;
class A{
    void hello(){
        System.out.println("Hello");
    }
}
class B extends A{
    void hello(){
        System.out.println("Helllo");
    }
}
public class Upcast {
    public static void main(String[] args) {
        A a = new A();
        a.hello();
    }
}
