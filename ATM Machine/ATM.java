package ATM Machine;
class BankingSystem {
    private double balance;
    
    public void deposit(double amount) {
           if(amount > 0) {
               balance += amount;
               System.out.println("desposit succesfully" + balance);
           }
        else {
            System.out,println("Invalid ammount");
        }
    }
    public void Withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal Successfull\n" + "Remaining Balance" + balance);
        }
    public void CheckBalance() {
    }
    
    
    
}


public class ATM {
    public static void main(String []args){
        
    
    
}}
