package FlowControlStatement;

public class GradeCheck {
    public static void main(String[] args) {
        int marks =69;
        if(marks > 90){
            System.out.println("Pass in first division");
        } else if (marks > 70 ) {
            System.out.println("Pass im second division");
        } else if (marks > 50 ) {
            System.out.println("Pass in third division");
        } else {
            System.out.println("Failed");
        }
    }
}
