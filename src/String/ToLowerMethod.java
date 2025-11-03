package String;

import java.util.Locale;

/* toLowerCase() is used to convert String upper case to lower case conversion.
*  toUpperCase() is used to convert String lower case to upper case.
*
* */
public class ToLowerMethod {
    public static void main(String[] args) {
        String str="I LEARN JAVA";
        System.out.println(str.toLowerCase());//i learn java---->O/P
        Locale turkish= Locale.forLanguageTag("tr");
        System.out.println(str.toLowerCase(turkish));
        String str2=str.toLowerCase();
        System.out.println(str2.toUpperCase());

    }
}
