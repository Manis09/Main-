package MethosOvetLoading;
class MethodOverload{
    String str1="Hello";
    String ste2="Hello";
    String str3=new String(str1);
    void check(){
        System.out.println(str3==ste2);
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(ste2));
        System.out.println(System.identityHashCode(str3));
    }
}
public class TestingApp {
    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.check();

    }
}
