package Constructor;
class Aaa{
    int x;
    Aaa(int x){
        System.out.println("Inside parent constructor");
    }
    Aaa(){
        this(5);
    }
}
class Bbb extends Aaa{

    Bbb(){
        System.out.println("child constructor");
    }
}

public class Testing {
}
