package Encaptulation;
class Voter{
    private int age;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public boolean canVote(){
        return age>=18;
    }
}
public class CastVote {
    public static void main(String[] args) {
        Voter voter1 = new Voter();
        Voter voter2 = new Voter();
        Voter voter3 = new Voter();

        voter1.setAge(18);
        voter2.setAge(25);
        voter3.setAge(15);

        System.out.println("Voter 1 age is "+voter1.getAge()+" -> "+(voter1.canVote() ? "Eligilble":"Not eligible"));
        System.out.println("Voter 2 age is "+voter2.getAge()+" -> "+(voter2.canVote() ? "Eligilble":"Not eligible"));
        System.out.println("Voter 3 age is "+voter3.getAge()+" -> "+(voter3.canVote() ? "Eligilble":"Not eligible"));
    }
}
