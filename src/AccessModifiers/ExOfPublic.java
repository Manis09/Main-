package AccessModifiers;

import java.sql.SQLOutput;
class ExOfPublic {
    private int a=10;
    private int b=20;
    int c=a+b;


    void add(){
        System.out.println("The addition is::"+c);
    }

        int sub(){
            c=b-a;
            return c;
        }

    public static void main(String[] args) {
        ExOfPublic ex=new ExOfPublic();
        ex.add();
        int res= ex.sub();
        System.out.println("The sub is::"+res);

    }
}
class Div{

}
