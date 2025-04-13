/*
. Write a program to copy the image from the specified path and paste on another path?
*/
import java.io.*;

public class File_copy_image
{ 
   public static void main(String x[]) throws Exception
   {
      
	  FileInputStream fr = new FileInputStream("C:\\revision\\logo.jpg");
	  FileOutputStream fw = new FileOutputStream("C:\\folderfirst\\logo.jpg");
	   
	   int data;
		while((data=fr.read())!=-1)
		{    fw.write(data);
		}
		fw.close();
		fr.close();
		System.out.println("Image copy paste successfully....");

		
   }
}