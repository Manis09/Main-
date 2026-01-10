package streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
    /**Convert a List<Integer> into a stream and print elements**/
    public static void stream1(){
        List<Integer> integerList=List.of(1,2,3,4,6,98);
        integerList.stream().forEach(n-> System.out.println(n));
    }

    /**Create a stream from an array*/
    public static void arrayToStream(){
        int[] array={10,20,30,40,50};
        IntStream intStream = Arrays.stream(array);
        intStream.forEach(System.out::println);
    }

    /**Count number of elements in a stream*/
    public static void countElementOfStream(){
        Stream<Integer> stream = Stream.of(10, 20, 40, 6, 70, 80, 70);
        long count = stream.count();
        System.out.println(count);
    }

    /**Create an infinite stream and limit it*/
    public static void infiniteStream(){
        //There are two ways create infinite stream
        //Stream.iterate(1,n-> n+1).limit(20).filter(n->n%2==0).forEach(System.out::println);

        Stream.generate(Math::random).limit(10).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    /**Filter even numbers*/
    public static void printEven(){
        Stream<Integer> stream = Stream.of(10, 50, 48, 5, 3, 80, 40, 69, 87, 41);
        stream.filter(n->n%2==0).forEach(System.out::println);
    }

    /**Filter null value from list*/
    public static void nullOutFromList(){
       List<Object> list= new ArrayList<>();
       list.add(10);
       list.add(null);
       list.add("Manish");
       list.add(null);
       list.add("Java");
       list.stream().filter(Objects::nonNull).forEach(System.out::println);
    }

    public static void main(String[] args) {
        //stream1();
        //arrayToStream();
        //countElementOfStream();
        //infiniteStream();
        //printEven();
        //nullOutFromList();

    }
}
