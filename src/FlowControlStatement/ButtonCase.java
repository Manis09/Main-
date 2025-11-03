package FlowControlStatement;
import java.util.*;
public class ButtonCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int button = scan.nextInt();
        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            default:
                System.out.println("Invalid button");
        }
    }
}
