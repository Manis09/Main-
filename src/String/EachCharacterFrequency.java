package String;

import java.util.HashMap;
import java.util.Map;

public class EachCharacterFrequency {
    public static void main(String[] args) {
        String str = "It is a It is a is a is lets say ";
        String[] s = str.split(" ");


        Map<String, Integer> wordFrequency = new HashMap<>();
      /*  for (int i = 0; i < s.length; i++) {

            if (wordFrequency.containsKey(s[i])) {
                wordFrequency.put(s[i], wordFrequency.get(s[i]) + 1);
            } else {
                wordFrequency.put(s[i], count);
            }
        }
        for (Map.Entry<String, Integer> m : wordFrequency.entrySet()) {
            System.out.println(m);
        }*/

        for(String st : s) {
            wordFrequency.put(st, wordFrequency.getOrDefault(st, 0) + 1);
        }
        wordFrequency.forEach((x,y)-> System.out.println(x+"---------- "+y));


    }
}
