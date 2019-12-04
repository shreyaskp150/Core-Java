package corepgm;

import java.util.Scanner;

public class Class5_overloading {
	
	public void area(int a,int b) 
	{
		int c=a*b;
		System.out.println("Area:"+c);
	}
	public void area(float a,float b) 
	{
		float c=0.5f*a*b;
		System.out.println("Area:"+c);
	}
	public void area(int a) 
	{
		int  c=a*a;
		System.out.println("Area:"+c);
	}
	public void area(float a) 
	{
		float c=3.14f*a*a;
		System.out.println("Area:"+c);
	}

	public static void main(String[] args) {
		String op2="";
		Scanner s=new Scanner(System.in);
		Class5_overloading obj=new Class5_overloading();
		int x,y;
		float m,n;
		int op1;
		do
		{
			System.out.print("1.Rectangle \n2.Triangle \n3.Square\n4.Circle\n5.Exit"
					+ "---->");
			
			op1=s.nextInt();
			switch(op1)
			{
			case 1:
				System.out.println("Enter the sides of the rectangle");
			     x=s.nextInt();
				 y=s.nextInt();
				 obj.area(x,y);
				 break;
			case 2:
				System.out.println("Enter the sides of the Triangle");
			     m=s.nextFloat();
				 n=s.nextFloat();
				 obj.area(m,n);
			break;
			case 3:
				System.out.println("Enter the sides of the Square");
			     x=s.nextInt();
				 obj.area(x);
			break;
			case 4:
				System.out.println("Enter the sides of the circle");
			     m=s.nextFloat();
				 obj.area(m);
			break;
			case 5:
				System.exit(0);
				break;
				default:
					break;
					}	
			System.out.println("Do you want to Conti....(yes/no)");
			op2=s.next();
		}while(op2.equals("yes"));
		
	}

}
