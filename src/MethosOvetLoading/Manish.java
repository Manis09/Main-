package MethosOvetLoading;
class MainParent{
    public static void main(String[] args) {
        System.out.println("parent main method");
    }
    public static void main(int b){
        System.out.println("overloded main");
    }
}
class MainMethodOverload {
    public static void main(String[] args) {
        MainParent.main(20);
    }
}


