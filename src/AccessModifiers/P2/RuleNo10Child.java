package AccessModifiers.P2;

import AccessModifiers.P1.RuleNo10;

public class RuleNo10Child extends RuleNo10 {
    @Override
    public void printMsg() {
        System.out.println("Method override in public");
    }

    @Override
    protected void msg() {
        System.out.println("Method override ");
    }

    public static void main(String[] args) {
        RuleNo10 obj=new RuleNo10();
        obj.printMsg();
        
    }
}
