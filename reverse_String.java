/*
Q2. WAP to create file and input the data and reverse the every word from string and stored in file

	input: 
			Input data in file
			Abc mno pqr 
		Output
			Demo.txt
				Cba onm rqp
*/

import java.util.*;
import java.io.*;

public class reverse_String
{
   public static void main(String x[]) throws Exception
   {
     
	  Scanner m=new Scanner(System.in);
	  
	 FileWriter fw = new FileWriter("C:\\FebRevisionFileHandling\\ReverseString.txt");
	 
	 System.out.println("Enter String:");
	   String str=m.nextLine();
	   
	     //to store current word
		 String currentWord="";
	  String rev="";     //to store final result
	
	  
      String  s[]=str.split(" ");
		 
		 
	  StringBuffer sb=new StringBuffer("");
		 for(int i=0;i<s.length;i++)
		 {
			 
		  sb =new StringBuffer(s[i]);
		 
		 
			currentWord+=sb.reverse();
			System.out.println("current word: "+currentWord);
			rev+=currentWord.concat(" ");
			currentWord="";
			
		 }
			fw.write(rev);
			fw.close();
		}
}
/*
	   for(int i=0;i<str.length();i++)
	   {
		  
	        if(i==str.length()-1||str.charAt(i) == ' ')
		    {
				if(i==str.length()-1)
				{
					 s+=str.charAt(i);
				}
				
				String revword="";
				
				for(int j=s.length()-1;j>=0;j--)
				{
				   revword+=s.charAt(j);
				}
				
				rev+=revword+" ";
				s=" ";
			}
			
			
			
			else
			{
				 s+=str.charAt(i);
			
			}
				
				
				
	   }
			
			
	   fw.write(rev);
	   fw.close();
	   // Output to console
        System.out.println("Reversed String: " +rev);
        System.out.println("Output written to file.");

	  
   }
}*/