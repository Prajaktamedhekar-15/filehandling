<<<<<<< HEAD


import java.util.*;
import java.io.*;

public class Store_even_len_words {

	public static void main(String[] args) throws Exception {
		
		Scanner m=new Scanner(System.in);
		
		FileWriter fw=new FileWriter("C:\\FebRevisionFileHandling\\FifthFile.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		System.out.println("Enter data");
		String s=m.nextLine();
		
		String [] str=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()%2==0)
			{
				
				bw.write(str[i]);
				bw.newLine();
				
				
			}
		}
		
		
		bw.close();
		fw.close();
		
		
		System.out.println("added successfully");
		
		
		
	}

}
=======


import java.util.*;
import java.io.*;

public class Store_even_len_words {

	public static void main(String[] args) throws Exception {
		
		Scanner m=new Scanner(System.in);
		
		FileWriter fw=new FileWriter("C:\\FebRevisionFileHandling\\FifthFile.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		System.out.println("Enter data");
		String s=m.nextLine();
		
		String [] str=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()%2==0)
			{
				
				bw.write(str[i]);
				bw.newLine();	
				
			}
		}
		bw.close();
		fw.close();
		System.out.println("added successfully");
		
	}

}
>>>>>>> 5f5963b (file)
