package javamisc;
public class Objectclass 
{ 
    static int last_roll = 100;  
    int roll_no; 
  
    // Constructor 
    Objectclass() 
    { 
        roll_no = last_roll; 
        last_roll++; 
    } 
  
    // Overriding hashCode() 
    @Override
    public int hashCode() 
    { 
        return roll_no; 
    } 
    
    // Driver code 
    public static void main(String args[]) 
    { 
        Objectclass s = new Objectclass(); 
  
        // Below two statements are equivalent 
        System.out.println(s); 
        System.out.println(s.toString()); 
        Object obj = new String("FACE");
        Class c = obj.getClass(); 
        System.out.println("Class of Object obj is : "+c.getName()); 
        s=null;
        System.gc();
    } 
    @Override
    protected void finalize() 
    { 
        System.out.println("finalize method called"); 
    }
} 