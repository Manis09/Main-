package Constructor;
class Child {
    int a;
    Child(){

        System.out.println("1 Parameter in child class");
    }
}
public class ConstrutorChanning {
    public static void main(String[] args) {

        Child ch =new Child();
        System.out.println(ch.a);
    }
}
