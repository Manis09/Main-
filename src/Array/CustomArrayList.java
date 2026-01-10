package Array;

import java.util.Arrays;

class ArrayListDemo {
    private final int defaultCap=10;
    private int size;
    private Object[] array;

    //Arraylist object creation by constructor
    public ArrayListDemo(){
        array=new Object[defaultCap];
    }

    //Add object in element
    public void add(Object o){
        ensureCapacity();
        array[size++]=o;
    }

    //to add element on specific element
    public void addOn(int index,Object o){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Provide vaild index under "+size);
        }
        ensureCapacity();
        for(int i=size;i>=index;i--){
            array[i]=array[i-1];
        }
        array[index]=o;
        size++;
    }
    public void ensureCapacity(){
        if(size>=array.length){
            int newSize=(size*3/2)+1;
            array=Arrays.copyOf(array,newSize);
        }
    }

    public void display(){
        System.out.print("[ ");
        for(int i=0;i<=size-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("]");
    }
    public int size(){
        return size;
    }
}

public class CustomArrayList {
    public static void main(String[] args) {
        ArrayListDemo list=new ArrayListDemo();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.addOn(2,20);
        System.out.println(list.size());
        list.display();
    }

}