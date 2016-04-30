package _3_9_method_parameters_and_dependency_injection;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertTrue;

import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Tag;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.TestInfo;

class TestInfoDemo {

	@BeforeEach
	void init(TestInfo testInfo) {
		String displayName = testInfo.getDisplayName();
		assertTrue(displayName.equals("TEST 1") || displayName.equals("test2"));
	}
	
	@Test
	@DisplayName("TEST 1")
	@Tag("my tag")
	void test1(TestInfo testInfo) {
		assertEquals("TEST 1", testInfo.getDisplayName());
		
		// あれ、TestInfo#getTags()なんてメソッドないじゃん。。。
//		assertTrue(testInfo.getTags().contains("my tag"));
	}

	@Test
	void test2() {
	}
}
