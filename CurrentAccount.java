/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccontTester1;

/**
 *
 * @author wasan
 */
public class CurrentAccount extends BankAccount {
    
    public CurrentAccount(){
        super();
    }
        public CurrentAccount (int accountNum,double initialBalance,String aCurrency){
              super(accountNum,initialBalance,aCurrency);
        }

    
    
   
    public String toString(){
        String text=String.format("Current Account number [%d] includes %s %.2f", accountNumber,currency,balance);
        
        return text;
    }
    
}
