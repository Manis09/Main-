package FlowControlStatement;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int accNumber=35197;
        int pin=12345;
        String accHolderName="Manish_Bhawsar";
        long accBalance=10264792258l;
        int choice=0;
        do{
            System.out.println("Enter the pin");
            Scanner scan=new Scanner(System.in);
            int atmPin= scan.nextInt();
            if(pin==atmPin){
                System.out.println("Your account number is: "+accNumber);
                System.out.println("Account holder name is: "+accHolderName);
                System.out.println("Please choose the below  option");
                System.out.println("Press 1: For withdrwal");
                System.out.println("Press 2: For check balance");
                System.out.println("Press 3: For deposit");
                System.out.println("Press 4: For exit");
                choice =scan.nextInt();
                if(choice==1){

                }


            }
            else{
                System.out.println("Please provide the correct pin");
            }
        }while(choice==4);
    }
}
