//WASAN ALZAHRANI 2513698 Lab3 Task 2
package lab3.task2;

import java.util.Scanner;
public class Lab3Task2 {

    
    public static void main(String[] args) {
    
     Scanner input=new Scanner(System.in);
      
     
     boolean pali=true;
     System.out.print(" Enter string : ");
      String str=input.nextLine();
     
     for(int i=0,j=str.length()-1 ; i<str.length()/2 ;i++,j--){
       if(str.charAt(i)!=str.charAt(j)){
       
       pali=false;}
    }
         
      if(pali)  
          System.out.println(str+" is a palindrome ");
      else
                    System.out.println(str+" is not  palindrome ");

    }
    
}
