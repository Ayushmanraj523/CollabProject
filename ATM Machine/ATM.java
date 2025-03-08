package ATM Machine;


class BankingSystem {
    
    // 2 varible liye balance or pin ATM card ke liye 
    private double balance;
    private int pin;

    // Constructor banaye taki object me argument pass kre to chale 
    //Contructer obj bante hi value put ho jayegi bina function ko call kiye 
    // For real World example Bank account kholte hi Amount or pin Rakhini padti pehle waise 
    BankingSystem(int initial balnce, int userpin){
        this.balance = initial balnce;
         this.pin = userpin;
        
    }
    // user ka pin sahi ho isiliye verification
    public boolean attontication(int enterpin){
        
        if(this.pin == enterpin){
            System.out.println("Correct Pin");    
        }
        else {
            System.out.println("Invalid Pin");
        }
     }
    // money deposite
    public void deposit(double amount) {
           if(amount > 0) {
               balance += amount;
               System.out.println("desposit succesfully" + balance);
           }
        else {
        
            System.out,println("Invalid ammount");
        }
    }

    // money withdraw
    public void Withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal Successfull\n" + "Remaining Balance" + balance);
        }

        // Balance Check
    public void CheckBalance() {
        System.out. println(" balance amount"+ balance);
    }  
}

// Ye Main class hai jaha obj , user input ,loop, switch case chalega 
public class ATM {
    public static void main(String []args){
        // user input 
        Scanner sc=new Scanner(System.in);
        // obj create kiye use class ka jissme code likhe hai
        BankingSystem bs=new BankingSystem(500,4783);

        // 3 se jada attmpt na ho isiliye ek variable 
        int attempt = 0;
        // ye boolean isiliye taaki first authenicate false ho user input correct daale tb hitrue ho wo loop break kre 
        boolean authenticate = false;
}}
