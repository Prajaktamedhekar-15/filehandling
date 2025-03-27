/*
Q1. Create folder using File class 

*/
import java.util.*;
import java.io.*;

public class Create_File
{
  public static void main(String x[])
  {
    File f=new File("C:\\folderfirst");
	if(f.exists())
	{
		System.out.println("Already created");
	}
	else
	{
	   boolean b=f.mkdir();
	 
	    if(b)
	   {
		  System.out.println("folder created successfully...");
	    }
	   else
	   {
		   System.out.println("some issues occur");
	    }
	}
	
	
  }
}