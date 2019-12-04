package corepgm;

class Parent
{
	void show()
	{
	System.out.println("parent class");
	}
}
class Child extends Parent
{
	void show()
	{
	System.out.println("child  class");
	}
}

public class Class6overriding {

	public static void main(String[] args) {
	Parent obj1=new Parent();	
	Child obj3=new Child();
	Parent obj2=new Child();
	obj1.show();
	obj2.show();
	obj3.show();
	
	}

}
