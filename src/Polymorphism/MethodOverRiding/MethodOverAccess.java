package Polymorphism.MethodOverRiding;
class AccessParent{
    void show(){
        System.out.println("Defult from parent");
    }
}
class AccessChild extends AccessParent{
    public void show(){
        System.out.println("Protected");
    }
}
public class MethodOverAccess {
}
