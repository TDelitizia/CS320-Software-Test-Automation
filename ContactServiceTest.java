package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	
@Test 
void testAddContact() {
	ContactService service = new ContactService();
	Contact contact = new Contact("12345", "Harry", "Styles", "1234567890", "445 Disco Avenue");
	
	service.addContact(contact);
	
	assertTrue(true);
}

@Test 
void testAddDuplicateContactId() {
	ContactService service = new ContactService();
	Contact contact1 = new Contact("12345", "Harry", "Styles", "1234567890", "445 Disco Avenue");
	Contact contact2 = new Contact("12345", "Kasey", "Musgraves", "1224567890", "77 Cowboy Way");
	
	service.addContact(contact1);
	
	assertThrows(IllegalArgumentException.class, () -> {
		service.addContact(contact2);
	});
}

@Test
void testDeleteContact() { 
	ContactService service = new ContactService();
	Contact contact = new Contact("12345", "Harry", "Styles", "1234567890", "445 Disco Avenue");
	
	service.addContact(contact);
	service.deleteContact("12345");
	
	assertTrue(true);
}

@Test
void testUpdateFirstName() { 
	ContactService service = new ContactService();
	Contact contact = new Contact("12345", "Harry", "Styles", "1234567890", "445 Disco Avenue");
	
	service.addContact(contact);
	service.updateFirstName("12345", "Kasey");
	
	assertTrue(contact.getFirstName().equals("Kasey"));
}

@Test
void testUpdateLastName() { 
	ContactService service = new ContactService();
	Contact contact = new Contact("12345", "Harry", "Styles", "1234567890", "445 Disco Avenue");
	
	service.addContact(contact);
	service.updateLastName("12345", "Musgraves");
	
	assertTrue(contact.getLastName().equals("Musgraves"));
}

@Test
void testUpdatePhone() { 
	ContactService service = new ContactService();
	Contact contact = new Contact("12345", "Harry", "Styles", "1234567890", "445 Disco Avenue");
	
	service.addContact(contact);
	service.updatePhone("12345", "1224567890");
	
	assertTrue(contact.getPhone().equals("1224567890"));
}

@Test
void testUpdateAddress() { 
	ContactService service = new ContactService();
	Contact contact = new Contact("12345", "Harry", "Styles", "1234567890", "445 Disco Avenue");
	
	service.addContact(contact);
	service.updateAddress("12345", "77 Cowboy Way");
	
	assertTrue(contact.getAddress().equals("77 Cowboy Way"));
}

}
