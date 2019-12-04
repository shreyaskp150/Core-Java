package corepgm;

public class Class4_child extends Class4_parent
{
	public void add()
	{
		int a=2,b=3,c=0;
		c=a+b+10;
		System.out.println(c);
	}

	public static void main(String[] args) {	
		
		Class4_parent obj=new Class4_child();
		obj.add();
		
		
	}

}
