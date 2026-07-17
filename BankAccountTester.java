
package BankAccontTester1;


public class BankAccountTester{

   
    public static void main(String[] args) {
          System.out.println("Information of Bank Accounts are as follows: "); 
         BankAccount accountl = new BankAccount();
         System.out.println(accountl.toString());
         accountl.setAccountNumber(200301); 
         accountl.setBalance(13004); 
         accountl.setCurrency("SAR");
         System.out.println(accountl.toString());
         BankAccount account2 = new BankAccount(300198, 1005.38);
         account2.setCurrency("USD"); 
         System.out.println(account2.toString());
         BankAccount account3 = new BankAccount(200405, "EUR");
         account3.setBalance(2000.25); 
         System.out.println(account3.toString()); 
         BankAccount account4 = new BankAccount(400206, 8009.78, "SAR"); 
         System.out.println(account4.toString()); 
         System.out.println();
         System.out.println("Operations on Bank Acounts: "); 
         System.out.println("Withdrawing 10000 SAR from account " + accountl.getAccountNumber()); 
         if(accountl.withdraw(10000)) 
              System.out.println(accountl.toString()); 
         else 
            System.out.println("Insufficient Balance!"); 
         System.out.println("Withdrawing 10000 SAR from account " + account4.getAccountNumber()); 
         if(account4.withdraw(10000)) 
              System.out.println(account4.toString()); 
        else 
               System.out.println("Insufficient Balance!");
         
    }
    
}
    
class BankAccount 
{ 
    int accountNumber; 
    double balance; 
    String currency;  

    public BankAccount() 
    { 
        accountNumber = -1 ; 
        balance = 0; 
        currency = "";
    }
    public BankAccount(int accountNum, double initialBalance)
    {
        accountNumber = accountNum; 
        balance = initialBalance; 
        currency = "SAR"; 
    }
    public BankAccount(int accountNum, String aCurrency) 
    {
        accountNumber = accountNum; 
        balance=0;
        currency=aCurrency;
    }
    public BankAccount(int accountNum,double initialBalance,String aCurrency){
        accountNumber=accountNum;
        balance=initialBalance;
        currency=aCurrency;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getCurrency(){
        return currency;
    }
    public void setAccountNumber(int accountNum){
        accountNumber=accountNum;
    }
    public void setBalance(double updatedBalance){
        balance=updatedBalance;
    }
    public void setCurrency(String aCurrency){
        currency=aCurrency;
    }
    public boolean withdraw(double amount){
        if(amount<=0)
            return false;
        if(balance<amount)
            return false;
        balance-=amount;
        return true;
    }
    public boolean deposit(double amount){
        if(amount<=0)
            return false;
        balance+=amount;
        return true;
    }
    public String toString(){
        return String.format("Bank Account Number [%d] includes %s %.2f",accountNumber,currency,balance);
    }
}
    
