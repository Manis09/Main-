package Encaptulation;
class CBV{
    int value(int a){
        a++;
        return a;
    }
}
public class CallByValue {
    public static void main(String[] args) {
        int a=15;
        CBV cbv = new CBV();
        int x= cbv.value(a);
        System.out.println(a);
        System.out.println(x);
    }


}
