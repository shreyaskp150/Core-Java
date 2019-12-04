package corepgm;
import java.util.Scanner;
public class Class1case {
	String name;
	String address;
	String email;
	int phno;
public static void main(String[] args) {
		
		Class1case obj=new Class1case();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter User Details");	
			System.out.println("Enter  user name");	
			 obj.name=s.next();
				System.out.println("Enter address");	
				 obj.address=s.next();
					System.out.println("Enter email");	
					 obj.email=s.next();
					 System.out.println("Enter Phone Number");	
					  obj.phno=s.nextInt();
	System.out.println("\n***User Details***");	
		System.out.println("Name:"+obj.name);
		System.out.println("Address:"+obj.address);
		System.out.println("Email:"+obj.email);
		System.out.println("Contact Number:"+obj.phno);
									  
		         
		
	}

}
