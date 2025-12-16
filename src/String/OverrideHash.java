package String;
class PrintingName extends Object{
    String name="Manish";
    String name1="Bhawsar";

    @Override
    public int hashCode() {
        return 100;
    }
}
public class OverrideHash {
    public static void main(String[] args) {
        PrintingName pn1=new PrintingName();
        System.out.println(pn1.hashCode());
        PrintingName pn2=new PrintingName();
        System.out.println(pn2.hashCode());

    }

}
