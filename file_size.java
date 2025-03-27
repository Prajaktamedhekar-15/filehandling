/*
Q5. Fetch file whose size is more than 2kb?
*/

import java.io.*;

public class file_size
{
  public static void main(String x[])
  {
     File f=new File("C:\\");
	 File l[]=f.listFiles();
	 
	 
	 for(int i=0;i<l.length;i++)
	 {
		if(l[i].isFile())
		{
			
	       long size =l[i].length()/1024; //size of specific file
		 
		 
	        if((size)>2)
		    {
	             System.out.println("file-->\t"+l[i] +"\t"+size);
		    }
		 }
		 else
		 {
			 long s=l[i].length(); //get folder size
			 
			 {
				 System.out.println("folder-->\t"+l[i]+"\t"+s);
			 }
		 }
		
	 }
  }
}