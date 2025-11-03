package MethosOvetLoading;
class FinalInstance{
    final int a;
    {
        a=10;
    }
    void printValue(){
        System.out.println(a);
    }
}
class ChildInstance extends FinalInstance{

}
public class FinalMethodOverloading {
    final void m1(){

    }
    void m1(int a,int b){

    }

    public static void main(String[] args) {
        ChildInstance c =new ChildInstance();
        int value=c.a;
        FinalInstance f=new FinalInstance();
    }
}
