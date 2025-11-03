package Polymorphism;

public class MethodOverloadWIthModifiers {
    private void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    protected void add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    long add(int a,int b,int c,long d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        MethodOverloadWIthModifiers molm=new MethodOverloadWIthModifiers();
        long addition=molm.add(10,20,30,40l);
        System.out.println(addition);
    }
}

