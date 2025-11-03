package Variable;

import java.util.Scanner;

public class Test1 {
        void sum(){
            int a =10;
            byte b= 127;
            int c=a+b;
            System.out.println(c);
        }
        public static void main(String[] args){
            Test1 t= new Test1();
            Test1 t1=new Test1();
            System.out.println(t.equals(t1));
            t.sum();
        }
    }
