package Variable;

public class LocalVariable {
  static int e=30;

    int  add(){
        int a=10; //LOCAL VARIABLE
        int b=20; //LOCAL VARIABLE
        int sum;
        return sum=a+b;

    }
    void diff(){
       int c=100;   //LOCAL VARIABLE
        int d=200; //LOCAL VARIABLE
        int diff=d-c;
        // diff=a-b;  this line will provide error because here we try to  use local variable from add()
        System.out.println(diff);
    }

    public static void main(String[] args) {
        LocalVariable lv =new LocalVariable();
        lv.add();
        lv.diff();

        System.out.println(LocalVariable.e+lv.add());

    }
}
