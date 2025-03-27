/*
Q2. Create File using File class?

*/

import java.io.*;

public class creation_file
{
  public static void main(String x[]) throws Exception
  {
    File f=new File("C:\\folderfirst\\mysencondFile.txt");
	
	
	if(f.exists())
	{
		System.out.println("already created");
	}
	else
	{
	boolean b=f.createNewFile();
	
	if(b)
	{
	  System.out.println("file created successfully....");
	}
	else
	{
		System.out.println("some issues");
	}
	}
  }
}
