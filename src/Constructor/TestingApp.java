package Constructor;
class ABC{
    ABC(){
        show();
    }
    void show(){
        System.out.println("Hello");
    }
}
class AAB extends ABC{
    int x=10;
    void show (){
        System.out.println("Child" +" " +x);
    }
}
public class TestingApp {
    public static void main(String[] args) {
        AAB a = new AAB();
    }
}
