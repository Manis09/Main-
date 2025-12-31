package Array;

import java.util.Arrays;

class ArrayListDemo {
    int defaultCapacity=10;
    int initialSize=0;
    Object[] array={};
    public ArrayListDemo() {
       array=new Object[defaultCapacity];
    }

    public void add(Object o){
        if(initialSize== array.length){
            int newCapacity=(array.length*3/2)+1;
            array=Arrays.copyOf(array,newCapacity);
        }
        array[initialSize++]=o;
    }
    public int size(){
      return initialSize;
    }
    public void remove(Object obj){

    }
    public void display(){
      for(int i=0;i<size();i++){
          System.out.print(array[i]+" ");
      }
    }
Object
}

public class CustomArrayList {
    public static void main(String[] args) {

        ArrayListDemo list = new ArrayListDemo();
       list.add(20);
       list.add(20);
       list.add(20);
       list.add(20);
       list.add(20);
       list.add(20);
       list.add(20);
       list.add(20);
       list.add(20);
       list.add(20);
       list.add(20);
       list.add(20);
       list.add(20);

       list.display();

    }

}