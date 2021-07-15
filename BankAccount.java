import java.security.PublicKey;

public class BankAccount {
    private int accountNo;
    private double balance;
    private String CustomerName;
    private String email;
    private int PhoneNo;


    public BankAccount(String CustomerName,int accountNo,
                       String email, int PhoneNo){
        // setter
        this.accountNo = accountNo;
        this.balance = 0.0;
        this.CustomerName = CustomerName;
        this.email =email;
        this.PhoneNo =PhoneNo;
   }
    // setter
    public void setAccountNo(int accountNo){
        this.accountNo= accountNo;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String CustomerName ){
        this.CustomerName= CustomerName;
    }
    public  void setPhoneNo(int PhoneNo){
        this.PhoneNo = PhoneNo;
    }
    public  void setEmail(String Email){
        this.email = Email;
    }


   // getter
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.CustomerName;
    }
    public int getAccountNo(){
        return this.accountNo;
    }
    public int getPhoneNo(){
        return this.PhoneNo;
    }
    public String getEmail(){
        return  this.email;
    }

public double Deposit(double amount){
      this.balance = this.balance +  amount;
      return this.balance;
}
public double Withdraw(double amount){
        String response = "no enough funds to make this transaction";
        if(amount>this.balance){
            return 0;
        }
        this.balance = this.balance - amount;
        return this.balance;
}

}
