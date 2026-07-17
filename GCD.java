//WASAN ALZAHRANI 2513698 Lab3 Task 1    2026/2/12


package gcd;
import java.util.Scanner;


public class GCD {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
System.out.print("Enter first integer : ");
int a =input.nextInt();


System.out.print("Enter second integer : ");

int b =input.nextInt();

int originalA=a;
int originalB=b;


while(a!=b){
if(a>b){
a=a-b;
}else
    b=b-a;


}
int gcd=a;
System.out.println(" THE GCD of "+originalA+ " and "+originalB+"="+gcd);

      
    }
    
}
