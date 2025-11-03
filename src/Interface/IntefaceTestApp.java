package Interface;
interface I1{
    int x=10;
    void fly();
}
interface I2 extends I1{
    void fly();
}
class Ts implements I1,I2{
    @Override
    public void fly() {

    }
}
public class IntefaceTestApp {
}
// If we have same method in two interface and we implements both interface on one class we need to provide its implementation
// it will not throw error.
// if i have same method in one interface and extends in another interface it will not give any error because by default every
// method treated as abstract.