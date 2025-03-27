/*
Q3. WAP to create file and input string from keyboard and if string is palindrom then store in file otherwise not

Example1:
Input Data in file
Aba 
Output:
Aba 

Example2:
Input Data in file
Abc 
Output:
Cannot store in file because string is not palindrome
*/

import java.util.*;
import java.io.*;

public class palindrome_String
{
   public static void main(String x[]) throws Exception
   {
     
	  Scanner m=new Scanner(System.in);
	  
	   
	   
	 FileWriter fw = new FileWriter("C:\\folderfirst\\palindrome_String.txt");
	 
	 System.out.println("Enter String:");
	   String str=m.nextLine();
	   
	   
	   char[]ch=new char[str.length()];
	   
        for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		
		int mid=ch.length/2;
		int end=ch.length-1;
		
		for(int i=0;i<mid;i++,end--)
		{
			char temp=ch[end];
			ch[end]=ch[i];
			ch[i]=temp;
		}
		 String rev=new String(ch);
		 
		 System.out.println(rev);
		 
		if(rev.equals(str))
		{
           fw.write(str);
		   fw.close();
		   
	    }
        else
		{
            System.out.println("Cannot store in file because string is not palindrome");
		}			
			
		 
		  
   }
}