package InnerClass;

public class MethodLocalInnerClass {
    void show(){
        System.out.println("Outer class");
        class MethodInner{
            public void msg(){
                System.out.println("Method inner class");
            }
        }
        MethodInner mi=new MethodInner();
        mi.msg();
    }

    public static void main(String[] args) {
        MethodLocalInnerClass obj1=new MethodLocalInnerClass();
        obj1.show();
    }
}
