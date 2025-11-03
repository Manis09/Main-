package Interface;
interface Animal{
    void sound();
}
class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Woh");
    }
}
class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
public class AnimalAppp {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
        System.out.println("-------------");
        Animal b=new Cat();
        b.sound();
    }
}
