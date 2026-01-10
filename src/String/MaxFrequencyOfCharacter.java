package String;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyOfCharacter {
    public static void main(String[] args) {
        String str="programmingmjahogiy";
        char[] charArray = str.toCharArray();
        int count=1;
        Map<Character,Integer> maxFre=new HashMap<>();
        for(int i=0;i<= charArray.length-1;i++){
            if(maxFre.containsKey(charArray[i])){
                maxFre.put(charArray[i],count+1);
            }else{
                maxFre.put(charArray[i],count);
            }
        }

        for(Map.Entry<Character,Integer> m:maxFre.entrySet()){

                System.out.println(m);

        }
    }
}
