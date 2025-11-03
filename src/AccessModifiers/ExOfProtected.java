package AccessModifiers;
class TT{
   static void show(){
       System.out.println("Hello");
   }
}
class TT1 extends TT{
  static void show(){
        System.out.println("Hello form");
    }
}
public class ExOfProtected {
    public static void main(String[] args) {
        TT t=new TT1();
         t.show();

    }
}
