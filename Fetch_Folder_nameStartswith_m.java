import java.io.*;

public class Fetch_Folder_nameStartswith_m {

	
	public static void main(String[] args) throws Exception
	{
		
		File f=new File("C:\\FebRevisionFileHandling");
		
		//File[] li=f.listFiles();
		 File li[]=f.listFiles();
		for(int i=0;i<li.length;i++)
			
		{/* 
			if((li[i].isFile())&&(li[i].getName().endsWith("e")))
			{
				System.out.println(li[i]);
				
			} */
			System.out.println(li[i]);
		}
	}

}


	   