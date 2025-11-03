package String;
/* TO get char at particular index we use charAt() method in java.
*  */
public class ToSearchCharacterInString {
    public static void main(String[] args) {
        String str = "JAVA TECHNOLOGY";
        char ch9 = str.charAt(9);
        char ch3 = str.charAt(3);
        System.out.println(ch3 + " " + ch9);// O/p --------> A N


        /*Frequency of character in  string
        * 1)By using charAt method
        * 2)BY coverting string into array */
        String frequency = "Hello hello jet";
        int count1 = 0;
        for(int i=0;i<=frequency.length()-1;i++){
            if(frequency.charAt(i)=='e'){
                count1++;
            }
        }
        System.out.println("The no of frequency of character"+" "+count1);
        char[] arr=frequency.toCharArray();
        int count2=0;
        for(int i=0;i<= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<= arr.length-1;i++){
            if(arr[i]=='h'){
                count2++;
            }
        }
        System.out.println("The frequency of h is "+" "+count2);

    }
}
