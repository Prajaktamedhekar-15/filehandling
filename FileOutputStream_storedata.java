/*

 Write a program to store data in file using FileOutputStream?
*/
import java.util.*;
import java.io.*;

public class FileOutputStream_storedata
{
  public static void main(String x[]) throws Exception
  {
	Scanner m=new Scanner(System.in);
    	System.out.println("Enter data");
	  String data=m.next();
	  byte[] b=data.getBytes();
	  
	  
	  FileOutputStream fw=new FileOutputStream("C:\\revision\\storeString.txt");
	  
	  fw.write(b);
	  fw.close();
	  
	  System.out.println("successfull");
	  
  }
}
