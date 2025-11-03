package Constructor;
class Ab{
    String name;
    Ab(String n){
        name=n;
        System.out.println("Name is: "+name);
    }
}
class Bb extends Ab{
    Bb(){
        super("Manish");
        System.out.println("CHild constructor");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Bb bb= new Bb();
    }
}
