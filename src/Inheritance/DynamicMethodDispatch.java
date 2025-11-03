package Inheritance;
class MethodDispatchParent{
    int a=20;
    void msg(){
        System.out.println("Parent msg");
    }
    private int add(){
        int a=200;
        return a;
    }

}
class MethodDispatchChild extends MethodDispatchParent{
    @Override
    void msg(){
        System.out.println("Child msg");
    }
    void print(){
        System.out.println("Child print");
    }
    static int add(int a){
        return a;
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        MethodDispatchChild pref=new MethodDispatchChild();
        pref.msg();
        MethodDispatchParent preff=new MethodDispatchParent();

    }
}
