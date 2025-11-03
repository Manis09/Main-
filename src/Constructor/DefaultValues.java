package Constructor;
class Test{
    int a;
    String name;
    Test()
    {
        System.out.println("No arg Constructor");
    }
    void printMsg(){
        System.out.println(a+" "+name);
    }

}
public class DefaultValues {
    public static void main(String[] args) {
        Test t= new Test();
        t.printMsg();
    }
}
