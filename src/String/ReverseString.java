package String;

public class ReverseString {
    public static void main(String[] args) {
        String name="Manish";
        System.out.println("Before reverse name:"+name);
        int length=name.length()/2;
        String reversed="";
        for(int i=0;i<=length;i++){
            reversed += name.charAt(i);
        }
        System.out.println(reversed);

    }

}
