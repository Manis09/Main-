package Datatype;

public class ReturnValue {
    int a=10;
   //If we declare local variable same name as instance variable name then local variable priority will higher
    int returning(int a){
        return a;
    }
    //If there no variable present in method then instance variable will return in method.
    int returning(){
        return (int)a;
    }

    public static void main(String[] args) {
        ReturnValue r = new ReturnValue();
       int res= r.returning(2);
       int res1=r.returning();
        System.out.println(res);
        System.out.println(res1);
    }
}
