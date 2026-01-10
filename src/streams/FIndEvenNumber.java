package streams;

import java.util.Arrays;
import java.util.List;

public class FIndEvenNumber {
    public static void main(String[] args) {
/*        List<Integer> list= List.of(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(n->n%2==0).map(n->n*2).forEach(System.out::println);

        List<String> names=List.of("Manish","Manoj","Prathmesh","Dani","Bharat","Avinash");
        names.stream().filter(s->s.startsWith("M")).forEach(System.out::println);

        List<List<Integer>> list1 = List.of(
                List.of(1,2),
                List.of(3,4)
        );

        list1.stream()
                .flatMap(l -> l.stream())
                .forEach(System.out::println);


        List<String> sentences = List.of("Hello World", "Java Stream");

        sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .forEach(System.out::println);*/

        //Unique character
        List<String> words = List.of("Java", "Stream");

        words.stream()
                .flatMap(w -> w.chars().mapToObj(c -> (char)c))
                .distinct()
                .forEach(System.out::println);



    }
}
