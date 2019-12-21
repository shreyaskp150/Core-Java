package regex;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
public class RegexExample2
{
	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile("Fa[a-z]e"); // range of characters from a - z will be matched against the single character k in Fake.
	    Matcher m = pattern.matcher("Fake"); 
	    if (m.find()) 
	      System.out.println("true");
	    else
	     System.out.println("false");
	    System.out.println(Pattern.matches("Fa[ac]e","Fabe"));
	    System.out.println(Pattern.matches("Do\\[","Do["));
	    System.out.println(Pattern.matches("Do[\\[\\]]","Do]"));
	    System.out.println(Pattern.matches("Hi\\d","Hi5"));
	    System.out.println(Pattern.matches("Hi\\D","Hi5"));
	    System.out.println(Pattern.matches("Hello\\sWorld","Hello World"));
	    System.out.println(Pattern.matches("Hello\\SWorld","Hello World"));
	    System.out.println(Pattern.matches("Hi\\wWorld","Hi5World"));
	    System.out.println(Pattern.matches("Hi\\WWorld","Hi5World"));
	    Pattern p1 = Pattern.compile("\\A[a-zA-Z]"); // range of characters from a - z will be matched against the single character k in Fake.
	    Matcher m1 = p1.matcher("Be strong"); 
	    while (m1.find()) 
	      System.out.println(m1.group());
	}
}