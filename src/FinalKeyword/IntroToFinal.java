package FinalKeyword;
final class FinalChild{
    void msg(){
        System.out.println("Hello");
    }
}
public class IntroToFinal {
    public static void main(String[] args) {
        FinalChild fc=new FinalChild();
        fc.msg();
    }
}

