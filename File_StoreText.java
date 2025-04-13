/*
. WAP to input string value from keyboard and store in text file using
 FileWriter class?
*/
 
 
import java.util.*;
import java.io.*;


public class File_StoreText
{
	public static void main(String x[]) throws Exception
	{
	   Scanner m=new Scanner(System.in);
      
        
		FileWriter fw=new FileWriter("C:\\revision\\String data.txt");
		 
		System.out.println("Enter String: ");
        String s=m.nextLine();
		
		fw.write(s);
		
		
		fw.close();
		
		System.out.println("Data successfully store...");
		

		
	}
}
		
  