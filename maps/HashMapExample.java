package maps;
import java.util.*;
public class HashMapExample
{
	public static void main(String[] args)
	{
		   int n,i;
	       String name;
	       int age;
	       Scanner sc=new Scanner(System.in);
	       n=sc.nextInt();
	       Map<Integer,Employee> map = new HashMap<Integer,Employee>();
	       Employee[] emp=new Employee[n];
	       for(i=0;i<n;i++)
	       {
	    	   name=sc.next();
	    	   age=sc.nextInt();
	    	   emp[i]=new Employee();
	    	   emp[i].setAge(age);
	    	   emp[i].setName(name);
	    	   map.put(i,emp[i]);
	       }
	       for(Map.Entry<Integer, Employee> entry:map.entrySet())
	       { 
	    	   int key=entry.getKey();
	    	   Employee e=entry.getValue();
	    	   System.out.println(key+" "+e.getName()+" "+e.getAge());
	       }
	       sc.close();
	}
}