package Inheritance;
class Parent1{
    static int a =10;
    static void me(){
        System.out.println("From parent class 1 static method");
    }
}
class Child1 extends Parent1{
   static void me(){
        System.out.println("From child class 1 static method");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Parent1.me();
        Parent1 ch1 = new Child1();
        ch1.me();
        System.out.println(ch1.a);
    }

}
