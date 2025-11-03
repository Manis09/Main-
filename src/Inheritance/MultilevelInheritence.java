package Inheritance;
class GrandParent
{
     String name= "Grandparent name is";
    void walkGrandParent()
    {
        System.out.println("Grandparent is walking");
    }
}
class Parent extends GrandParent{
    String name = "Parent name is";
    @Override
    void walkGrandParent() {
        System.out.println("Parent is walking");
    }
}
class Child extends Parent{
    void walkChild()

    {
        System.out.println("Child is walking");
    }
    void run()

    {
        System.out.println("Child is running");
    }
}
class GrandChild extends Child
{
    void runGrandChild()
    {
        System.out.println("Grand child running faster");
    }
}
public class MultilevelInheritence {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        Child cd=new Child();
        Parent p=new Parent();
        cd.walkGrandParent();

        gc.run();
        gc.walkGrandParent();
        gc.walkChild();
        GrandParent gp = new GrandParent();
        gp.walkGrandParent();
         }
}
