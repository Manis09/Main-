package Constructor;
class A{
    int num;
    String name;
}
public class CopyConstructor {
    public static void main(String[] args) {
        A ref= new A();
        A ref1=new A();

        System.out.println(ref.num);
        System.out.println(ref.name);
        System.out.println("------------------------");
        System.out.println(ref1.num);
        System.out.println(ref1.name);
    }
}
