package Interface;
interface Tet{
    class Tst{

    }
    interface tbt{

    }
    void sste();

}
class Tbt implements Tet{
    static void area(){
        System.out.println("Hello static class");
    }

    @Override
    public void sste() {

    }
}
class tct extends Tbt implements Tet{
   void tsr(){

    }
}

public class Tests {
    public static void main(String[] args) {
        System.out.println("Hello");
        Tet.Tst tst=new Tet.Tst();
    }
}
