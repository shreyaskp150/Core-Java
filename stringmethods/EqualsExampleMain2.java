package stringmethods;
import java.util.ArrayList;
public class EqualsExampleMain2
{
	public static void main(String[] args)
	{  
        String str1 = "FACENXT";  
        ArrayList<String> list = new ArrayList<>();  
        list.add("FACE");   
        list.add("FACEPREP");  
        list.add("FACENXT");  
        list.add("FACENOW");  
        for (String str : list)
        {  
            if (str.equals(str1))
            {  
                System.out.println("FACENXT is present");  
            }  
        }  
    }
}