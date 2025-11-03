package Polymorphism.TypeConversion;
class TypeConversionParent{
    void show(long a){
        System.out.println(a*a +"long arg ");
    }
    void show(float a){
        System.out.println(a*a +"int arg");
    }
}
public class TypeConversion {
    public static void main(String[] args) {
        TypeConversionParent pa =new TypeConversionParent();
        pa.show(25);
    }
}
