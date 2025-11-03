package Interface;
interface Test{
    void test();
}
public class Interface1 implements Test {
  public void test(){
     System.out.println("Hello");
 }

    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.test();
    }
}
class Test1 extends Interface1{

}
