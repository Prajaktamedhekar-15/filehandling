/*
4. WAP to create file and input string from keyboard and store only capital letter , vowel in file 

*/

import java.io.*;
import java.util.*;

public class Store_capital_vowel
{
   public static void main(String x[]) throws Exception
   {
     Scanner m=new Scanner(System.in);
	 
	 FileWriter fw=new FileWriter("C:\\folderfirst\\Upper_letterANDVowel.txt");
	 System.out.println("Enter String:");
	 String s=m.nextLine();
	 String upp="";
       for(int i=0;i<s.length();i++)
	   {
		    if((s.charAt(i)>=65&&s.charAt(i)<=90))
		    {
			   upp+=s.charAt(i);
			}
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				upp+=s.charAt(i);
			}
	   }
	   System.out.println(upp);
	   
			   fw.write(upp);
			   
			   //System.out.println("upper"+s.charAt(i));
		   
	   
	   fw.close();
	}
}
	 
