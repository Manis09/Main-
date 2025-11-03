package Polymorphism.MethodOverRiding;
class A{

}
class B extends A{

}
class C extends B{

}
class Test{
    void test(A a){
        System.out.println("One");
    }
    void test (B b){
        System.out.println("Two");
    }
    void test(String str){
        System.out.println("Three");
    }
    void test(Object obj){
        System.out.println("Four");
    }
}
public class MethodOverRidingTest {
    public static void main(String[] args) {
        C c = new C();
        Test t=new Test();
        t.test(c);
    }
}
