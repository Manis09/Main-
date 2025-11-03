package MethosOvetLoading;

public class TestMethodOverload {
    public static void msg(long a, int b) {
        System.out.println("Hello");
    }
    public static void msg(int a, int b) {
        System.out.println("Hi");
    }
    public static void main(String[] args)
    {
        msg(5l, 10);
        msg(10,11);
    }
}
