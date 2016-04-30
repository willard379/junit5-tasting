package _3_3_custom_names;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;

@DisplayName("A special test case")
class DisplayNameDemo {

	@Test
	@DisplayName("Custom test name containing spaces")
	void testWithDisplayNameContainingSpaces() {

	}

	@Test
	@DisplayName("╯°□°）╯")
	void testWithDisplayNameContainingSpecialCharacters() {

	}

	@Test
	@DisplayName("😱")
	void testWithDisplayNameContainingEmoji() {

	}

}
