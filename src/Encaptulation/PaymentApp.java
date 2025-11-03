package Encaptulation;
abstract class Payment{
    private double amount;
    Payment(double amount){
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        if(amount>0){
            this.amount=amount;
        }else {
            System.out.println("Invalid payment amount");
        }
    }
    abstract void pay();
}
class UpiPayment extends Payment{
    UpiPayment(double amount){
        super(amount);
    }
    @Override
    public void pay(){
        System.out.println("Payment of " +getAmount()+" done using UPI ");
    }
}
public class PaymentApp {
    public static void main(String[] args) {
        UpiPayment upi = new UpiPayment(2000000);
        System.out.println(upi.getAmount());
        upi.setAmount(1500);

    }
}
