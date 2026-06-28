package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

@Test
void testContact() {
	
	Contact contact = new Contact(
		"12345",
		"Harry",
		"Styles",
		"1234567890",
		"445 Disco Avenue"
		
	);
	
	assertTrue(contact.getContactId().equals("12345"));
	assertTrue(contact.getFirstName().equals("Harry"));
	assertTrue(contact.getLastName().equals("Styles"));
	assertTrue(contact.getPhone().equals("1234567890"));
	assertTrue(contact.getAddress().equals("445 Disco Avenue"));
	
}

@Test
void testContactIdTooLong() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact (
				"12345678910",
				"Harry",
				"Styles",
				"1234567890",
				"445 Disco Avenue"
		);
	});

}

@Test
void testContactIdNull() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact (
				null,
				"Harry",
				"Styles",
				"1234567890",
				"445 Disco Avenue"
		);
	});

}

@Test
void testFirstNameTooLong() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact (
				"12345",
				"HarryStyles",
				"Styles",
				"1234567890",
				"445 Disco Avenue"
		);
	});

}

@Test
void testFirstNameNull() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact (
				"12345",
				null,
				"Styles",
				"1234567890",
				"445 Disco Avenue"
		);
	});

}

@Test
void testLastNameTooLong() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact (
				"12345",
				"Harry",
				"StylesStyles",
				"1234567890",
				"445 Disco Avenue"
		);
	});

}

@Test
void testLastNameNull() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact (
				"12345",
				"Harry",
				null,
				"1234567890",
				"445 Disco Avenue"
		);
	});

}

@Test
void testPhoneInvalid() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact (
				"12345",
				"Harry",
				"Styles",
				"99999",
				"445 Disco Avenue"
		);
	});

}

@Test
void testPhoneNull() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact (
				"12345",
				"Harry",
				"Styles",
				null,
				"445 Disco Avenue"
		);
	});

}

@Test
void testAddressTooLong() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact (
				"12345",
				"Harry",
				"Styles",
				"1234567890",
				"445 Disco Avenue Apartment 19811"
		);
	});

}

@Test
void testAddressNull() {
	assertThrows(IllegalArgumentException.class, () -> {
		new Contact (
				"12345",
				"Harry",
				"Styles",
				"1234567890",
				null
		);
	});

}
}
