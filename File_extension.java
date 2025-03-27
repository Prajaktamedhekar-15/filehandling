/*
Q6. Fetch files whose extension is .png or jpeg etc
*/

import java.io.*;

public class File_extension
{
  public static void main(String x[])
  {
     File f=new File("C:\\Users\\praja\\OneDrive\\Desktop\\java class\\css\\css practical");
	 
	 File l[]=f.listFiles();
	 
	 for(int i=0;i<l.length;i++)
	 {
	    if(l[i].isFile()&&(l[i].getName().endsWith(".png")||l[i].getName().endsWith(".jpg")))
		{
		   System.out.println(l[i]);
		}
		}
	}
}
		   