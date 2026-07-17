/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BankAccontTester1;



import java.util.ArrayList;


public class Lab10_1 {

    
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts=new ArrayList<>();
        CurrentAccount account1=new CurrentAccount();
        account1.setCurrency("SAR");
        account1.setBalance(8009.78);
        account1.setAccountNumber(200301);
        SavingsAccount account2=new SavingsAccount((int) 400206.0,13000.0,"SAR",780.0);
       
        accounts.add(account1);
        accounts.add(account2);
        
        
        System.out.println("Inofrmation of Bank Accounts are as follows: ");
        for(int i=0;i<accounts.size();i++){
             System.out.println(accounts.get(i));
        }
        
        System.out.println("\nPerforming first transfer: ");
        if(accounts.get(0).transfer(accounts.get(1), 500.0)){
            System.out.println("Successful transfer\n");
        }else{
            System.out.println("Failed transfer\n");
        }
        System.out.println("Inofrmation of Bank Accounts are as follows: ");
         for(int i=0;i<accounts.size();i++){
             System.out.println(accounts.get(i));
        }
        
        
         System.out.println("\nPerforming second transfer: ");
        if(accounts.get(1).transfer(accounts.get(0), 500.0)){
            System.out.println("Successful transfer\n");
        }else{
            System.out.println("Failed transfer\n");
        }
        System.out.println("Inofrmation of Bank Accounts are as follows: ");
         for(int i=0;i<accounts.size();i++){
             System.out.println(accounts.get(i));
        }
        
        
        
         System.out.println("\nPerforming third transfer: ");
        if(accounts.get(0).transfer(accounts.get(1), 2000.0)){
            System.out.println("Successful transfer\n");
        }else{
            System.out.println("Failed transfer\n");
        }
        System.out.println("Inofrmation of Bank Accounts are as follows: ");
         for(int i=0;i<accounts.size();i++){
             System.out.println(accounts.get(i));
        }
    }
    
}
