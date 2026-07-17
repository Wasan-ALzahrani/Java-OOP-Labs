/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BankAccontTester1;

/**
 *
 * @author wasan
 */
public class Lab9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        CurrentAccount account1=new CurrentAccount();
        account1.setCurrency("SAR");
        account1.setBalance(8009.78);
        account1.setAccountNumber(200301);
        SavingsAccount account2=new SavingsAccount(400206,13000,"SAR",780);
        System.out.println("Inofrmation of Bank Accounts are as follows: ");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println("\nPerforming first transfer: ");
        if(account1.transfer(account2, 500)){
            System.out.println("Successful transfer\n");
        }else{
            System.out.println("Failed transfer\n");
        }
        System.out.println("Inofrmation of Bank Accounts are as follows: ");
        System.out.println(account1);
        System.out.println(account2);
         System.out.println("\nPerforming second transfer: ");
        if(account2.transfer(account1, 500)){
            System.out.println("Successful transfer\n");
        }else{
            System.out.println("Failed transfer\n");
        }
        System.out.println("Inofrmation of Bank Accounts are as follows: ");
        System.out.println(account1);
        System.out.println(account2);
         System.out.println("\nPerforming third transfer: ");
        if(account1.transfer(account2, 2000)){
            System.out.println("Successful transfer\n");
        }else{
            System.out.println("Failed transfer\n");
        }
        System.out.println("Inofrmation of Bank Accounts are as follows: ");
        System.out.println(account1);
        System.out.println(account2);
    }
    
}
