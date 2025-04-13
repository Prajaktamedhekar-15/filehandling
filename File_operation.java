
import java.util.*;
import java.io.*;


public class File_operation
{
  
   public static void main(String x[]) throws Exception
   {
	    Scanner m=new Scanner(System.in);
		
		System.out.println("case 1:count voewls,consonant and digit");
		System.out.println("case 2:Extract digit and sum");
		System.out.println("Case 3 Read csv file");
		
		
		System.out.println("Enter 4 for exit");
		
		
		do{
			
		System.out.println("Enter choice:");
		int ch1=m.nextInt();

       FileReader fr=new FileReader("C:\\FebRevisionFileHandling\\firstFile.txt");
				
				int data;
		
		switch(ch1)
		{
			case 1:
			{
				//FileReader fr=new FileReader("C:\\FebRevisionFileHandling\\firstFile.txt");
				
				//int data;
				int c=0;
				int v=0;
				int d=0;
				
				while((data=fr.read())!=-1)
				{
					int ch=data;
					
					if((ch>=65&&ch<=90)&&(ch!='A'||ch!='E'||ch!='I'||ch!='O'||ch!='U')||((ch<=97&&ch>=122)&&(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')))
					{
						c++;
					}
					else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
					{
						v++;
						
					}
					else if(ch>=48&&ch<=57)
					{
						d++;
					}
					else{
						
					}
					
				}
				
				System.out.println("consonate are :=>"+c+"\t"+"vowels=>"+v+"\t"+"digit:=>"+d);
				
				
				break;
				
			}
			case 2:
			{
				int sum=0;
				
				while((data=fr.read())!=-1)
				{
					int ch=data;
					
					if(ch>=48&&ch<=57)
					{
						sum+=ch-48;
					}
				}
				
				System.out.println("After extraction sum is:"+sum);
				
					
				
				break;
				
			}
			case 3:
			{
				
		           File f = new File("C:\\FebRevisionFileHandling\\student.csv");
	               FileReader fr1 = new FileReader(f);
	               BufferedReader br = new BufferedReader(fr1);
	                String line;
	    
	                while( (line=br.readLine())!=null)
	                {
		                 String da[]=line.split(" ");
			 
			               for(String fin:da)
			               { 
		                      System.out.print(fin+"\t");
			                }
			             System.out.println();
	                }
	     
	       


				break;
				
			}
			case 4:
			{
				break;
				
			}
			case 5:
			{
				break;
				
			}
			case 6:
			{
				System.exit(0);
			}
			default:
			System.out.println("Wrong choice");
			
		  }
		}
		while(true);
		
		
   }
}