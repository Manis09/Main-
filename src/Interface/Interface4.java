package Interface;
interface I11{
    void prnt();
}
interface I12{
    void prnt();
}
interface I13{
    void prnt();
}
interface I14 extends I11,I12,I13{

}
class T implements I14{
    @Override
    public void prnt() {
        System.out.println("Hello from class");
    }
}
public class Interface4  {
    public static void main(String[] args) {
        T t= new T();
        t.prnt();
    }
}
