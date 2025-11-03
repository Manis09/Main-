package AccessModifiers.P1;
class Rule9Parent{
 private void msg(){
     System.out.println("Hello");
 }
 static void printMsg(){
     System.out.println("Static print msg Parent");
 }
 final int sum(){
     return 10;
 }
}
class Rule9Child extends Rule9Parent{
    static void printMsg(){
        System.out.println("Static print msg child");
    }
//    int sum(){
//        System.out.println("final method can not be overriden");
//    }
}
public class RuleNo9 {
    public static void main(String[] args) {
        Rule9Child child = new Rule9Child();
        // child.msg(); Private method is not inherited so we cannot override the method.
        Rule9Child.printMsg();
//Here parent method is hide when we redeclare the static method and child version get executed because
//static method belong to class.

    }
}