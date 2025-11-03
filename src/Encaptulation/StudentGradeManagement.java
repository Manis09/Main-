package Encaptulation;
class Student{
    private String name;
    private int age;
    private int roll_No;
    private int marks;

    public void setStudentDetails(String name,int age,int roll_No,int marks){
        this.name=name;
        this.age=age;
        this.roll_No=roll_No;
        this.marks=marks;
    }
    public void getStudentDetails(){
        System.out.println("Student name: "+this.name);
        System.out.println("Student age: "+this.age);
        System.out.println("Student roll No: "+this.roll_No);
        System.out.println("Student marks: "+this.marks);
    }
    public void getGrade(){
        if(marks>=75){
            System.out.println("A");
        } else if (marks>=50) {
            System.out.println("B");
        } else if (marks>=35) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }
}
public class StudentGradeManagement {
    public static void main(String[] args) {
        Student stu1=new Student();
        Student stu2=new Student();
        Student stu3=new Student();
        stu1.setStudentDetails("Manish",26,181053,55);
        stu1.getStudentDetails();
        stu1.getGrade();
        System.out.println("--------------------------------------------");
        stu2.setStudentDetails("Satyam",25,181054,75);
        stu2.getStudentDetails();
        stu2.getGrade();
        System.out.println("--------------------------------------------");
        stu3.setStudentDetails("Prashant",25,181055,49);
        stu3.getStudentDetails();
        stu3.getGrade();
    }
}
