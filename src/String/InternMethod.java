package String;
/**
 * Intern method is used internally when we create string as literal and if we want to move our string from heap to SCP we cam use
 * intern() method.
 */
public class InternMethod {
    public static void main(String[] args) {
        String name="Manish";
//Here compiler wiil add intern() and JVM will check first if there SCP is having this object if it present inside SCP it will
// return the reference of the same object and if it not present it will create an object.
        String copyOfName=new String("Manish");
        //Here a copyOfName is shifted to SCP but currently JVM is manages the reference for it.and and also it is present inside
        //the HEAP which reference is hold BY copyOfName.
        copyOfName.intern();
        System.out.println(name==copyOfName); // false
        copyOfName=copyOfName.intern();
        System.out.println(name==copyOfName);//true
        System.out.println(name.length());
        System.out.println(name.charAt(5));
        System.out.println(name.substring(1,4));

    }
}
