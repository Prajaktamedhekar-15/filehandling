/*
WAP to read text files using BufferedReader and display file content?
*/
import java.io.*;

public class file_BufferedReader_displayText
{
  public static void main(String x[]) throws Exception
  {
	  FileReader fr=new FileReader("C:\\revision\\storeText appendMode.txt");
	  BufferedReader br=new BufferedReader(fr);
	  String s;
	  
	  while((s=br.readLine())!=null)
	  {
	    System.out.println(s);
	  }
	  
  }
}