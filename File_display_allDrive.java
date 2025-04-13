/*
 Write a program to display the all drive list from the hard disk on the output screen?
*/
import java.io.*;

public class File_display_allDrive
{
  public static void main(String x[])
  {
      File f[]= File.listRoots();
	  
	 
	 for(int i=0;i<f.length;i++)
	 {
		 System.out.println(f[i]);
	 }
  }
}