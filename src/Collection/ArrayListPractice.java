package Collection;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {


        //Question1;Crete an arraylist and 5 elements and print

        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        /*// Find the size of list
        System.out.println(list.size());

        // remove the element from list
         list.remove(0);
        System.out.println(list);


        //check element present or not
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the element ");
        boolean present=list.contains(scan.nextInt());
        System.out.println(present);

       //Iterate using for loop, enhanced,iterator

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(Object i:list){
            System.out.println(i);
        }

        Iterator iterator= list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
    }
}
