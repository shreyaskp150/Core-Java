package maps;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
public class LinkedHashMapExample
{
	public static void main(String[] args)
	{
		   int n,i;
	       String name;
	       int age;
	       Scanner sc=new Scanner(System.in);
	       n=sc.nextInt();
	       LinkedHashMap<Integer,Employee> linkedhashmap = new LinkedHashMap<Integer,Employee>();
	       Employee[] emp=new Employee[n];
	       for(i=0;i<n;i++)
	       {
	    	   name=sc.next();
	    	   age=sc.nextInt();
	    	   emp[i]=new Employee();
	    	   emp[i].setAge(age);
	    	   emp[i].setName(name);
	    	   linkedhashmap.put(i,emp[i]);
	       }
	       for(Map.Entry<Integer, Employee> entry:linkedhashmap.entrySet())
	       { 
	    	   int key=entry.getKey();
	    	   Employee e=entry.getValue();
	    	   System.out.println(key+e.getName()+e.getAge());
	       }
	       sc.close();
	}
}