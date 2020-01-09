package linkedlist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import linkedlist.Employee;
public class LinkedListExample 
{
	public static void main(String[] args)
	{
		   int n,i;
	       String name;
	       int age;
	       Scanner sc=new Scanner(System.in);
	       n=sc.nextInt();
	       LinkedList<Employee> ll = new LinkedList<Employee>();
	       Employee[] emp=new Employee[n];
	       for(i=0;i<n;i++)
	       {
	    	   name=sc.next();
	    	   age=sc.nextInt();
	    	   emp[i]=new Employee();
	    	   emp[i].setAge(age);
	    	   emp[i].setName(name);
	    	   ll.add(emp[i]);
	       }
	       Iterator<Employee> itr = ll.iterator();
	       while(itr.hasNext())
	       {
	        	Employee e = (Employee)itr.next();
	            System.out.println(e.getName()+e.getAge());
	       }
	       sc.close();
	}
}