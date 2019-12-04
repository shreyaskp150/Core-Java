package corepgm;

import java.util.Scanner;

public class Class3case {
	

	public static void main(String[] args) {
		 Class3_3case obj=new Class3_3case();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter User Details");	
			System.out.println("Enter  user name");	
			 String name=s.next();
			 obj.setname(name);
			    System.out.println("Enter address");	
				 String address=s.next();
				 obj.setaddress(address);
					System.out.println("Enter email");	
					 String email=s.next();
					 obj.setemail(email);
					 System.out.println("Enter Phone Number");	
					  int phno=s.nextInt();
					  obj.setphno(phno);
					  
					  //user details
						System.out.println("\n***User Details***");	
							System.out.println("Name:"+obj.getname());
							System.out.println("Address:"+obj.getaddress());
							System.out.println("Email:"+obj.getemail());
							System.out.println("Contact Number:"+obj.getphno());

	}

}
