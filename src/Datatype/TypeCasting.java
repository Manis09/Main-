package Datatype;

public class TypeCasting {
    int calculate(long a){
        return (int)a;
    }

    public static void main(String[] args) {
        TypeCasting t = new TypeCasting();
       long res= t.calculate(20450465);
        System.out.println(res);
    }
}
