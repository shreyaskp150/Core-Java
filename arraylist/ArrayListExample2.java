package arraylist;
import java.util.ArrayList;
public class ArrayListExample2
{
    public static void main(String[] args)
    {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        Contact firstContact = new Contact("tim","181888424");
        Contact secondContact = new Contact("john","181888425");
        contacts.add(firstContact);
        contacts.add(secondContact);
        for(int i=0; i< contacts.size(); i++)
        {
            System.out.println(contacts.get(i).getName());
        }
    }
}
class Contact
{
    private String name;
    private String phoneNumber;
    public Contact(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName()
    {
        return name;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber) 
    {
        return new Contact(name, phoneNumber);
    }
}