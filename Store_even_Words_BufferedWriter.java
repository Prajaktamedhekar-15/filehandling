<<<<<<< HEAD

/*
Q1. WAP to create file and store only even size words in file using BufferedWriter
Example:
Abc Mnop pqr

Demo.txt
*/

import java.util.*;
import java.io.*;

public class Store_even_Words_BufferedWriter
{
   public static void main(String x[]) throws Exception
   {
      Scanner m=new Scanner(System.in);
	  System.out.println("Enter words");
	  String word=m.nextLine();
	  
	  FileWriter fw=new FileWriter("C:\\folderfirst\\BufferfileApp.txt",true);
	  
	  BufferedWriter bw=new BufferedWriter(fw);
	  if(word.length()%2==0)
	  {
	       bw.write(word);
	        bw.newLine();
			bw.close();
			System.out.println("Data saced successfuly...");
	  }
	 else
	 {
		 System.out.println("you entered odd no of word");
		 bw.close();
	 }
	  
	  
	  fw.close();
	  
   }
=======

/*
Q1. WAP to create file and store only even size words in file using BufferedWriter
Example:
Abc Mnop pqr

Demo.txt
*/

import java.util.*;
import java.io.*;

public class Store_even_Words_BufferedWriter
{
   public static void main(String x[]) throws Exception
   {
      Scanner m=new Scanner(System.in);
	  System.out.println("Enter words");
	  String word=m.nextLine();
	  
	  FileWriter fw=new FileWriter("C:\\folderfirst\\BufferfileApp.txt",true);
	  
	  BufferedWriter bw=new BufferedWriter(fw);
	  if(word.length()%2==0)
	  {
	       bw.write(word);
	        bw.newLine();
			bw.close();
			System.out.println("Data saced successfuly...");
	  }
	 else
	 {
		 System.out.println("you entered odd no of word");
		 bw.close();
	 }
	  
	  
	  fw.close();
	  
   }
>>>>>>> 5f5963b (file)
}