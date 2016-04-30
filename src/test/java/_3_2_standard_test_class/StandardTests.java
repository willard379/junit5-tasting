package _3_2_standard_test_class;

import org.junit.gen5.api.AfterAll;
import org.junit.gen5.api.AfterEach;
import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Disabled;
import org.junit.gen5.api.Test;

class StandardTests {

	@BeforeAll
	static void initAll() {
//		System.out.println("@BeforeAll");
	}

	@BeforeEach
	void init() {
//		System.out.println("@BeforeEach");
	}

	@Test
	void succeedingTest() {
//		System.out.println("@Test:succeedingTest");
	}

	@Test
	void failingTest() {
//		System.out.println("@Test:failingTest");
//		fail("a failing test");
	}

	@Test
	@Disabled("for demonstration purposes")
	void skippedTest() {
//		System.out.println("@Test:skippedTest");
	}

	@AfterEach
	void tearDown() {
//		System.out.println("@AfterEach");
	}

	@AfterAll
	static void tearDownAll() {
//		System.out.println("@AfterAll");
	}
}
