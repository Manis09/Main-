package Array;

import java.util.*;

class Employee{

}
public class ShiftingElement {
    public static void main(String[] args) {

        List<Integer> set = new ArrayList<>();

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(3);
        set.add(4);

        System.out.println("Before iterating: " +set);
        for(Integer i:set){
            if(i==1){
                set.set(2,10);
            }
            System.out.println(i);

        }
        System.out.println("After iterating: " +set);

        Iterator<Integer> i= set.iterator();



        /*String s="Manishbhawsar";
        int count=1;
        for(int i=0;i<=s.length()-1;i++){
            for(int j=1;j<=s.length()-1;j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            System.out.println(s.charAt(i)+"-------"+count);
            count=0;
        }
        Employee emp1=new Employee();
         Employee emp2=new Employee();
        System.out.println(emp1==emp2);
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());*/
    }
}