package ATM;


class BankingSystem {
    
    // 2 varible liye balance or pin ATM card ke liye 
    private double balance;
    private int pin;

    // Constructor banaye taki object me argument pass kre to chale 
    //Contructer obj bante hi value put ho jayegi bina function ko call kiye 
    // For real World example Bank account kholte hi Amount or pin Rakhini padti pehle waise 
    BankingSystem(int initial balance, int userpin){
        this.balance = initial balance;
         this.pin = userpin;
        
    }
    // user ka pin sahi ho isiliye verification
    public boolean authentication(int enterpin){
        
        return this.pin == enterpin;
     }
    // money deposit
    public void deposit(double amount) {
           if(amount > 0) {
               balance += amount;
               System.out.println("desposit succesfully" + balance);
           }
        else {
        
            System.out.println("Invalid ammount");
        }
    }

    // money withdraw
    public void Withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal Successfull\n" + "Remaining Balance" + balance);
        }

        // Balance Check
    public double CheckBalance() {
        return balance;
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
        // yaha pe while loop lagaye hai taaki 3 attempt se jyada naaa jaye 
        // aur tumhare entered pin ko original pin se match karke dekhe 
        while(attempt < 3){
            System.out.print(" Enter your pin");
            int StorePin= sc.nextInt();
            if (bs.authentication(StorePin)){
                authenticate = true;
                break;
                // agar attempts match na kare toh incorrect pin show karega 
            }else{
                attempt++;
                System.out.println("Incorrect Pin" + (3 - attempt));
            }
        }
        // aur agar 3 attempts me ek bhi match na kare toh too many attempts ka message show karega 
        if(!authenticate){
            System.out.println(" Too Many Attempts! Please come after 24 hours\n"+"(24 ghante ke liye shakal mat dikhana)");
            sc.close();
            return;
        }
        
}}
