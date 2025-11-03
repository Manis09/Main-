package Encaptulation;

import java.util.Scanner;

class Bank{
    private String mobileNu;
    private String accNumber;
    private String accHolderName;
    private int atmPin;

    public void setAccNumber(String accNumber){
        this.accNumber=accNumber;
    }
    public void setMobileNu(String mobileNu){
        this.mobileNu=mobileNu;
    }
    public void setAtmPin(int atmPin){
        this.atmPin=atmPin;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void getAtmPin(){
        System.out.println("Account holder ATM pin is "+atmPin);
    }
    public void getAccNumber(){
        System.out.println("Account number is "+accNumber);
    }
    public void getMobileNu(){
        System.out.println("Account holder mobile number is "+mobileNu);
    }

    public void getAccHolderName() {
        System.out.println("Account holder name is "+accHolderName);
    }
}
public class BankingApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Created object for first user
        Bank user1=new Bank();
        //Asking the details from user
        System.out.println("Enter user name");
        String user1AccHolderName=scan.nextLine();

        System.out.println("Enter Account Number");
        String user1AccNumber= scan.nextLine();

        System.out.println("Enter Mobile Number");
        String user1MobileNu= scan.nextLine();

        System.out.println("Enter ATM pin");
        int atmPin= scan.nextInt();
        //Setting the user input
        user1.setAccHolderName(user1AccHolderName);
        user1.setAccNumber(user1AccNumber);
        user1.setMobileNu(user1MobileNu);
        user1.setAtmPin(atmPin);
        //Providing information of user
        user1.getAccHolderName();
        user1.getAccNumber();
        user1.getMobileNu();
        user1.getAtmPin();

       //Created object for second user
        Bank user2=new Bank();

        System.out.println("Enter user name");
        String user2AccHolderName=scan.nextLine();

        System.out.println("Enter Account Number");
        String user2AccNumber= scan.nextLine();

        System.out.println("Enter Mobile Number");
        String user2MobileNu= scan.nextLine();

        System.out.println("Enter ATM pin");
        int user2AtmPin= scan.nextInt();

        user2.setAccHolderName(user2AccHolderName);
        user2.setAccNumber(user2AccNumber);
        user2.setMobileNu(user2MobileNu);
        user2.setAtmPin(user2AtmPin);

        user2.getAccHolderName();
        user2.getAccNumber();
        user2.getMobileNu();
        user2.getAtmPin();


    }
}
