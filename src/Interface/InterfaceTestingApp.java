package Interface;
interface Testing2{
    void showMsgToUser();
}
interface Testing1 {
    void showMsgToUser();
}
class Testing implements Testing1,Testing2{
    @Override
    public void showMsgToUser() {
        System.out.println("Hello");
    }
}
public class InterfaceTestingApp {
}
