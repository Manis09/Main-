package Abstraction;
abstract class Animal{
    abstract void sound();
}
class Lion extends Animal{
    void sound(){
        System.out.println("Lion Roars");
    }
}
class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger roars");
    }
}
public class AnimalApp {
    public static void main(String[] args) {
        Lion l = new Lion();
        Class classObject=l.getClass();
        System.out.println();
        l.sound();
        System.out.println("-------------");
        Tiger t =new Tiger();
        t.sound();
    }
}
