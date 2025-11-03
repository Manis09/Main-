package Interface;
interface  I{

}
class A implements I{

}
public class InterfaceTest {
    public static void main(String[] args) {
        A obj = new A();
        if (obj instanceof I){
            System.out.println("Yess");
        }else{
            System.out.println("Noo");
        }
    }
}
