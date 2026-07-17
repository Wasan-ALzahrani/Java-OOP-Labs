
package lab11_2;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab11_2 {
    


     public static String decryptString (String inputString, int aKey){
        String outputStr="";
       for(int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);
            ch-=aKey;
            outputStr+=ch;
        }
       return outputStr;
    }
  public static boolean decryptFile (String inputFile, String outputFile,int aKey) throws IOException{
         File file=new File(inputFile);
  if(file.exists()){
         Scanner readFile=new Scanner(file);
         PrintWriter write=new PrintWriter(outputFile);
         while(readFile.hasNext()){
              String inputString=readFile.nextLine();
              String decryptedLine=decryptString(inputString,aKey);
              write.println(decryptedLine);
          }
            readFile.close();
            write.close();
            return true;
         }else{
             return false;
         }
   }
    public static void main(String[] args) throws IOException{
        Scanner scan=new Scanner(System.in);
       String inputFile,outputFile;
       int key;
        System.out.print("Enter input file name (ex: in.txt) : ");
        inputFile=scan.nextLine();
        System.out.print("Enter output file name (ex: out.txt) :");
        outputFile=scan.nextLine();
        System.out.print("Enter key for encyption : ");
        key=scan.nextInt();
        
        if(decryptFile(inputFile,outputFile,key)){
            System.out.println("decryption done");
        }else{
            System.out.println("Error in file");
        }
    }
}

