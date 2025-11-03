package Inheritance;
class StaticParent{
    static void show(){
        System.out.println("Parent");
    }
    public void show(int a){
        System.out.println("Overloaded method");
    }
}
class StaticChild extends StaticParent{
//  protected void show(int a){
//      System.out.println("Over riden");
//  }
public void show(int a){
      System.out.println("Overriding");
  }
}
public class StaticApp {
    public static void main(String[] args) {
        StaticChild.show();
    }
}
