package MethosOvetLoading;
class ParentStaticMethods{
    void msg(){
        System.out.println("Parent static");
    }
}
class ChildStaticMethods extends ParentStaticMethods{
     void msg(){
        System.out.println("Child static");
    }
}
public class StaticMethodOverload {
    public static void main(String[] args) {
        ParentStaticMethods PSM=new ChildStaticMethods();
        System.out.println(PSM.getClass());
    }
}
