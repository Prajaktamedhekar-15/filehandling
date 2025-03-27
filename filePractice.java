
import java.util.*;
import java.io.*;

public class filePractice
{
  public static void main(String x[]) 
  {
     File f=new File("C:\\FilehandlingPrac");
	 File f1=new File(f,"file3");
	 
	 File[]d=File.listRoots();
	 for(int i=0;i<d.length;i++)
	 {
		 System.out.println(d[i]);
	 }
	 
	 
	 
	 PrintWriter pw = new PrintWriter("output.txt")) 
       pw.println("Hello, World!");
       pw.println(100);

	 
	 
	 if(f1.exists())
	 {
		 System.out.println("Already created..");
	 }
	 else
	 {
		 try{
		   boolean b= f1.createNewFile();
		
		if(b)
		{
			
	      System.out.println("Successfully created...");
		}
		else
		{
			System.out.println("some problem occurs.");
		}
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }
    }
}