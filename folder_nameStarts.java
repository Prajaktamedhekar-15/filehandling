<<<<<<< HEAD
/*
Q3. Fetch folder whose name start with m from particular path

*/

import java.io.*;

public class folder_nameStarts
{
  public static void main(String x[]) throws Exception
  {
	  File f=new File("c:\\folderfirst");  //particular path`s folder 
	  File l[]=f.listFiles();
	  
	  for(int i=0;i<l.length;i++)
	  {
		  if(l[i].isDirectory()&& l[i].getName().startsWith("m"))
		  {
			  System.out.println(l[i]);
		  }
	  }
	  
		  
	  
  }
}

/*
c:\folderfirst\myFirstFile
=======
/*
Q3. Fetch folder whose name start with m from particular path

*/

import java.io.*;

public class folder_nameStarts
{
  public static void main(String x[]) throws Exception
  {
	  File f=new File("c:\\folderfirst");  //particular path`s folder 
	  File l[]=f.listFiles();
	  
	  for(int i=0;i<l.length;i++)
	  {
		  if(l[i].isDirectory()&& l[i].getName().startsWith("m"))
		  {
			  System.out.println(l[i]);
		  }
	  }
	  
		  
	  
  }
}

/*
c:\folderfirst\myFirstFile
>>>>>>> 5f5963b (file)
*/