package linkedlist;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListExample1 
{
	public static void main(String args[])
  	{
   		LinkedList<String> a = new LinkedList<String>();
   		a.add("Competition");
   		a.add("Be positive");
   		a.add("Happy Day");
   		Iterator<String> it = a.iterator();
   		while(it.hasNext())
   		{
     		System.out.println(it.next());
   		}
 	}
}