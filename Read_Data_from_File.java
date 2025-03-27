import java.util.*;
import java.io.*;

public class Read_Data_from_File
{
  public static void main(String x[])  throws Exception
  {
	  Scanner m=new Scanner(System.in);
	  
	  FileReader fr=new FileReader("C:\\FebRevisionFileHandling\\FifthFile.txt");
	  
	  int data;

	    while( (data= fr.read() ) !=-1 )
		{
			System.out.print((char)data);
			
    	}
		
		//System.out.println(data);
		
	  
	  
  }
}