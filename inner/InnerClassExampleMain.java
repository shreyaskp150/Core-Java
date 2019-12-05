package inner;
class InnerClassExampleMain
{
	private int data=30;  
	class Inner
	{  
		void msg(){System.out.println("data is "+data);}  
	}  
	public static void main(String args[])
	{  
		InnerClassExampleMain obj=new InnerClassExampleMain();  
		InnerClassExampleMain.Inner in=obj.new Inner();  
		in.msg();  
	}  
} 