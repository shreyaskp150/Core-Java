package stringmethods;
public class EqualsExampleMain1 
{
	public static void main(String args[])
	{  
		String s1="facenow";  
		String s2="facenow";  
		String s3="faceprep";  
		String s4="facenxt";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
	}
}