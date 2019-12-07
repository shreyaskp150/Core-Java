package staticexp;
class StaticExample
{  
	static int count=0;
	//will get memory only once and retain its value 
	StaticExample()
	{  
		count++;  
		System.out.println(count);  
	}  
	public static void main(String args[])
	{  
		StaticExample c1=new StaticExample();  
		StaticExample c2=new StaticExample();  
		StaticExample c3=new StaticExample();  
	}  
}  