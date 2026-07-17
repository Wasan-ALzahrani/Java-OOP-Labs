package lab3.task1;
//WASAN ALZAHRANI 2513698  Lab3 Task 1
import java.util.Scanner;


public class Lab3Task1 {

   
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int a,b;
      System.out.print("Pleas Enter number : ");
      a=scan.nextInt();
      System.out.print("Pleas Enter second number : ");
      b=scan.nextInt();
            System.out.print(" THE GCD of  "+a+" and "+b+" = ");

      
      while(a!=b){
      if(a>b)
          a=a-b;
      else
          b=b-a;
      }
            System.out.println(a);

      
    }
    
}
