<<<<<<< HEAD
/*
4. Fetch file whose extension is .doc or .txt
*/

import java.io.*;

public class folder_name_ends
{
  public static void main(String x[]) throws Exception
  {
	  File f=new File("c:\\folderfirst");  //particular path`s folder 
	  File l[]=f.listFiles();
	  
	  for(int i=0;i<l.length;i++)
	  {
		  if(l[i].isFile()&&( l[i].getName().endsWith(".doc")|| l[i].getName().endsWith(".txt")))
		  {
			  System.out.println(l[i]);
		  }
	  }
	  
		  
	  
  }
}
=======
/*
4. Fetch file whose extension is .doc or .txt
*/

import java.io.*;

public class folder_name_ends
{
  public static void main(String x[]) throws Exception
  {
	  File f=new File("c:\\folderfirst");  //particular path`s folder 
	  File l[]=f.listFiles();
	  
	  for(int i=0;i<l.length;i++)
	  {
		  if(l[i].isFile()&&( l[i].getName().endsWith(".doc")|| l[i].getName().endsWith(".txt")))
		  {
			  System.out.println(l[i]);
		  }
	  }
	  
		  
	  
  }
}
>>>>>>> 5f5963b (file)
