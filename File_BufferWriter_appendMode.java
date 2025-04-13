/*
WAP to input string value from keyboard and store in text file using BufferedWriter
 class and apply append mode on file?
*/
import java.util.*;
import java.io.*;

public class File_BufferWriter_appendMode
{
	public static void main(String x[]) throws Exception
	{
		Scanner m=new Scanner(System.in);
		
FileWriter fw=new FileWriter("C:\\revision\\storeText appendMode.txt",true);
		
		BufferedWriter  bw=new BufferedWriter (fw);
		
		System.out.println("Enter text:");
		String s=m.nextLine();
		
		bw.write(s);
		bw.newLine();
		bw.close();
	}
}
