/*
 Write a program to display all files and folders from a particular path?
*/
import java.io.*;

public class File_DisplayFileAndFolder
{
   public static void main(String x[])
   {
	   File f =new File("c:\\");
	   File []list=f.listFiles();
	   
	   
	   System.out.println("Files are");
	   for(int i=0;i<list.length;i++)
	   {
		   if(list[i].isFile())
		   {
		      System.out.println(list[i]);
		   }
		  
		   
	   }
	   
	   System.out.println("\n\tfolders are");
	  for(int i=0;i<list.length;i++)
	   {
		   if(list[i].isDirectory())
		   {
		      System.out.println(list[i]);
		   }
		  
		   
	   } 
	   
   }
}
