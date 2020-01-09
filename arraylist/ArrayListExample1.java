package arraylist;
import java.util.*;
public class ArrayListExample1
{
    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);
        int numberOfItems = in.nextInt();
        ArrayList<String> stationary = new ArrayList<String>();
       	for(int i =0; i < numberOfItems; i++)
      	{
        	String name = in.next();
            stationary.add(name);
      	}
      	System.out.println(stationary);
      	//Print the list in Reverse
      	for(int i = numberOfItems-1; i>=0; i--)
        	System.out.println(stationary.get(i));
      	in.close();
  	}
}