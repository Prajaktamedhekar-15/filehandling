<<<<<<< HEAD
import java.io.*;

class Employee implements Serializable
{
   private int id;
   private String name;
   private int sal;
   
    Employee(int id,String name,int sal)
	{
	   this.id=id;
	   this.name=name;
	   this.sal=sal;
	}
	public int  getId()
	{
	  return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSal()
	{
		return sal;
	}
}
public class serialization{
	public static void main(String x[]) throws Exception{
		 FileInputStream fin = new FileInputStream("C:\\revision\\storeString.txt");
		 ObjectInputStream oin=new ObjectInputStream(fin);
		 Object obj=oin.readObject();
		 Employee e=(Employee)obj;
		 System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal()); 
		 }
}
		
	
=======
import java.io.*;

class Employee implements Serializable
{
   private int id;
   private String name;
   private int sal;
   
    Employee(int id,String name,int sal)
	{
	   this.id=id;
	   this.name=name;
	   this.sal=sal;
	}
	public int  getId()
	{
	  return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSal()
	{
		return sal;
	}
}
public class serialization{
	public static void main(String x[]) throws Exception{
		 FileInputStream fin = new FileInputStream("C:\\revision\\storeString.txt");
		 ObjectInputStream oin=new ObjectInputStream(fin);
		 Object obj=oin.readObject();
		 Employee e=(Employee)obj;
		 System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal()); 
		 }
}
		
	
>>>>>>> 5f5963b (file)
