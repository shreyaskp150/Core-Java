package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayListExample
{
	public static void main(String[] args)
	{
		   int n,i,value;
	       String name;
	       int age;
	       Scanner sc=new Scanner(System.in);
	       n=sc.nextInt();
	       ArrayList<Employee> al = new ArrayList<Employee>();
	       Employee[] emp=new Employee[n];
	       for(i=0;i<n;i++)
	       {
	    	   name=sc.next();
	    	   age=sc.nextInt();
	    	   emp[i]=new Employee();
	    	   emp[i].setAge(age);
	    	   emp[i].setName(name);
	    	 al.add(emp[i]);
	       }
	       Iterator<Employee> itr = al.iterator();
	       while(itr.hasNext())
	       {
	        	Employee e = (Employee)itr.next();
	            System.out.println(e.getName()+" "+e.getAge());
	       }
	       sc.close();
	}
}