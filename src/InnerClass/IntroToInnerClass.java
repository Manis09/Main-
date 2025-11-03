package InnerClass;

/*Inner class are the class which is present inside the class.It is also called as nested class.
  We cannot declare static variable, methods inside inner class.

  To Create object of inner class we have to create object of the outer class first.

  Syntax to cerate object  of inner class

  OuterClassName reference variable= new OuterClassName();
  OuterClassName.InnerClassName Reference variable= reference variable of Outer class.new Inner class name.


=======================================================================================================================================
Inner class can access the methods and variables of the outer class but outer class cannot access the method of outer class.


*/
public class IntroToInnerClass {
    int a = 10;
    final int b = 20;
    static void msg(){
        System.out.println("Static method of outer class");
    }
    void methodOfOuterClass() {
        System.out.println("Outer Class");
        show();
    }
    static {
        System.out.println("Static block of outer class");
    }
    private void show(){
        System.out.println("Private method");
    }

     class InnerClass {
        int a;
        static int b=20;
        InnerClass() {
            a = 30;
        }
        static{
            System.out.println("Static block of inner class");
        }
        static void printMsg(){
            System.out.println("Static method of inner class");
        }

        void methodInnerClass() {
            System.out.println("Inner class");
            methodOfOuterClass();
            System.out.println(a+" "+b);
            msg();
        }
    }

}
class Outer extends IntroToInnerClass{

    public static void main(String[] args) {
        IntroToInnerClass itic = new IntroToInnerClass();
        IntroToInnerClass.InnerClass ic = itic.new InnerClass();
        System.out.println(ic.a);
        System.out.println(itic.a);
        Outer outer = new Outer();
        InnerClass.printMsg();

    }
}