package _3_4_assertions;

import static org.junit.gen5.api.Assertions.assertAll;
import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertTrue;
import static org.junit.gen5.api.Assertions.expectThrows;
import static org.mockito.Mockito.spy;

import org.junit.gen5.api.Test;

class AssertionsDemo {

	@Test
	void standardAssertions() {
		assertEquals(2, 2);
		assertEquals(4, 4, "The optional assertion message is now the last parameter.");
		assertTrue(true, () -> "Assertion messages can be lazily evaluated -- "
				+ "to avoid constructing complex messages unnecessarily");
	}

	@Test
	void groupedAssertions() {
		// Setup
		Address address = spy(new Address());
		// when(address.getFirstName()).thenReturn("willard");
		// when(address.getLastName()).thenReturn("379");

		assertAll("address", () -> assertEquals("John", address.getFirstName()),
				() -> assertEquals("User", address.getLastName()));
	}

	@Test
	void exceptionTesting() {
		IllegalArgumentException exception = expectThrows(IllegalArgumentException.class, () -> {
			throw new IllegalArgumentException("a message");
		});
		assertEquals("a message", exception.getMessage());
	}
}

class Address {
	String getFirstName() {
		return "John";
	}

	String getLastName() {
		return "User";
	}
}