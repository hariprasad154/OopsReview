package Com.BridgeLabs;
import Com.BridgeLabs.Contact;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AdressBook {
	Scanner src =new Scanner (System.in);
	
	static List<Contact> Contactlist=new ArrayList<>();
	void AddresssBook(Contact contact) {
		Contactlist.add(contact);
		
	}
	void addContact() {

		System.out.println("Enter the FirstName");
		String name = src.next();
		System.out.println("Enter the Age");
		String age = src.next();
		System.out.println("Enter the FirstName");
		String phoneNumber = src.next();
		System.out.println("Enter the City");
		String city = src.next();
		System.out.println("Enter the State");
		String state = src.next();
		
		//Contact contact = new Contact( name,age,phoneNumber,city,state);
		Contact contact=new Contact();
		contact.setName(name);
		contact.setAge(age);
		contact.setCity(city);
		contact.setState(state);
		contact.setPhoneNumber(phoneNumber);
		AddresssBook(contact);	
	}
	void showContacts() {
		System.out.println("the contacts present ithe Address Book");
		
		for (Contact i :Contactlist) {
			System.out.println(i.getName());
			System.out.println(i.getAge());
			System.out.println(i.getPhoneNumber());
			System.out.println(i.getCity());
			System.out.println(i.getState());
			System.out.println("-------------");
			
		}
		
	}
	
}
