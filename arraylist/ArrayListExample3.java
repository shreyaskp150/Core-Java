package arraylist;
import java.util.*;
class ArrayListExample3
{
	public static void main(String args[])
  	{
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	ArrayList<Integer> marks = new ArrayList<Integer> ();
    	for(int i =0; i<n; i++)
    	{
      		int m = in.nextInt();
      		marks.add(m);
    	}
    	ArrayList<Integer> clone2 = (ArrayList<Integer>) marks.clone();
		ArrayList<Integer> clone = clone2;
		ArrayList<Integer> sortMarks = clone;
    	Collections.sort(sortMarks);
    	System.out.println("Actual List"+marks);
    	System.out.println("Sorted Marks");
    	for(int i =0; i<n; i++)
      		System.out.println(sortMarks.get(i));
    	in.close();
  	}
}