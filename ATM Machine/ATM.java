package ATM Machine;
class BankingSystem {
    private double balance;
    
    public void deposite(double amount) {
           if(amount > 0) {
               balance += amount;
               System.out.println("desposite succesfully" + balance);
           }
        else {
            System.out,println("Invalid ammount");
        }
    }
    public void Withdraw() {
    }
    public void CheckBalance() {
    }
    
    
    
}


public class ATM {
    public static void main(String []args){
        
    
    
}}
