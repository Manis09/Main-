package InnerClass;
//We can access the instance variable and methods inside inner class even private.
public class NestedInnerClass {
    int num=10;
    int num1=200;
    void show(){
        System.out.println(num);
    }
    class Test{
        int num=20;
        void show(){
            System.out.println(num);
            NestedInnerClass.this.show();
            System.out.println(num1);
        }
    }

    public static void main(String[] args) {
        NestedInnerClass obj1=new NestedInnerClass();
        NestedInnerClass.Test t=obj1.new Test();
        t.show();

    }
}
