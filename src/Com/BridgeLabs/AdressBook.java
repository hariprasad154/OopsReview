package Com.BridgeLabs;
import Com.BridgeLabs.Contact;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AdressBook {
	
	Scanner src =new Scanner (System.in);
	static List<Contact> Contactlist=new ArrayList<>();
	Map<String,Contact>hashMap=new HashMap<String,Contact>();
	

	void AddresssBook(Contact contact) {
		Contactlist.add(contact);	
		hashMap.put(contact.getName(), contact);
	}
	
	void addContact() {

		System.out.println("Enter the FirstName");
		String name = src.next();
		System.out.println("Enter the Age");
		String age = src.next();
		System.out.println("Enter the PhoneNumber");
		String phoneNumber = src.next();
		System.out.println("Enter the City");
		String city = src.next();
		System.out.println("Enter the State");
		String state = src.next();
		
		Contact contact = new Contact( name,age,phoneNumber,city,state);
		//Contact contact=new Contact();
		contact.setName(name);
		contact.setAge(age);
		contact.setCity(city);
		contact.setState(state);
		contact.setPhoneNumber(phoneNumber);
		
		AddresssBook(contact);	
		
		//hashMap.put(Contactlist,contact.getName() );
		
		
	}
//	void HasBook() {
//		Iterator <String>iterator =hashMap.keySet().iterator();
//		
//		while(iterator.hasNext()) {
//			Contact temp=hashMap.get(iterator.next());
//			System.out.println(temp.getName() + " ");
//		}
//	}
void Book() {
	System.out.println("!!!!!!!!!");
	Set<Map.Entry<String,Contact>> entry=hashMap.entrySet();
		for (Map.Entry<String,Contact > j :entry) {
			System.out.println("this is j "+j);
			System.out.println("this is the key "+j.getKey());
			
			System.out.println("this is the value "+j.getValue());
	
			
		}
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