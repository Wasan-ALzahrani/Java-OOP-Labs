/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccontTester1;

/**
 *
 * @author wasan
 */
public class SavingsAccount extends BankAccount{
    private double profit;
     private double profitPercent;

     
     public SavingsAccount(){
         super();
         profit=0;
         profitPercent=.06;
     
     }
     public SavingsAccount(int accountNum, double initialBalance,double profit,double profitPercent){
            super(accountNum,initialBalance);
            this.profit=profit;
            this.profitPercent=profitPercent;
     
     }
     
     public SavingsAccount(int accountNum, String aCurrency,double profit,double profitPercent){
            super(accountNum,aCurrency);
            this.profit=profit;
            this.profitPercent=profitPercent;
     
     }
     
     
      public SavingsAccount(int accountNum, double initialBalance,String aCurrency,double profit,double profitPercent){
            super(accountNum,initialBalance,aCurrency);
            this.profit=profit;
            this.profitPercent=profitPercent;
     
     }

  
     public SavingsAccount(int accountNum,double initialBalance,String aCurrency,double profit){
        super(accountNum,initialBalance,aCurrency);
        this.profit=profit;
       profitPercent=.06;
    }
    

   
     
     
    public double getProfitPercent() {
        return profitPercent;
    }

    public void setProfitPercent(double profitPercent) {
        this.profitPercent = profitPercent;
    }
   public boolean deposit(double amount){
   if (amount<1000)
       return false;
   else
       return super.deposit(amount);
   }
    
    public boolean withdraw(double amount){
    if(super.withdraw(amount)){
      profit=0;
      return true;
    }
    else{
                return false;

    }
    
    }
   

    public void setProfit(double profit){
        this.profit=profit;
    }
    public double getProfit(){
            return profit;
    }
     public String toString(){
        profit=balance*profitPercent;
        double totalBalance=balance+profit;
        String text=String.format("Saving Account number [%d] includes %.2f profit %.2f %s %.2f", accountNumber,balance,profit,currency,totalBalance);
        return text;
    }
    
}

