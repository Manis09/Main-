package MethosOvetLoading;

public class TypeConversion {
    double add(float a,float b){
        System.out.println("1");
        return a+b;
    }
    float add(long i,float j){
        System.out.println("2");
        return i+j;
    }

    public static void main(String[] args) {
        TypeConversion tc = new TypeConversion();
        System.out.println(tc.add(20.2f,253.3f));
    }
}
