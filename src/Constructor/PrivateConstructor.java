package Constructor;
class Pri{
    final int a=10;
    Pri(){
        System.out.println("Parent constructor");
    };
//Factory
//    public static Pri createObject(){
//        return new Pri();
//    }
}
class Pri1 extends Pri{
    Pri1(){
        System.out.println("Child constructor");
    }
}
public class PrivateConstructor {
    public static void main(String[] args) {
        Pri1 p1 = new Pri1();
        System.out.println(p1.a);
    }
}
