package Datatype;

public  class Default {
    public static void main(String[] args) {
        String str1="Nano";
        String str2= new String("Memo");
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));

        StringBuffer sb=new StringBuffer();
        sb.append(str1);
        sb.append(str2);
        System.out.println(sb.toString());

    }
}

