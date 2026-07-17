/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccontTester1;

/**
 *
 * @author wasan
 */
public class BankAccount {
    
 
    /**
     *
     */
    protected int accountNumber; 
    protected double balance; 
    protected String currency;  
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
    public boolean transfer(BankAccount x,double amount){
        if(this instanceof CurrentAccount && x instanceof SavingsAccount){
            ((SavingsAccount) x).setProfitPercent(.06);
            if(!((SavingsAccount) x).deposit(amount)){
                System.out.println("deposit <1000 in SavingAccount!");
                return false;
            }
           this.withdraw(amount);
           return true;
            
        }
        else if(this instanceof SavingsAccount && x instanceof CurrentAccount){
            ((SavingsAccount) this).setProfitPercent(0);
            ((SavingsAccount) this).withdraw(amount);
             x.deposit(amount);
             return true;
        }else
            return false;
    }

}
    


