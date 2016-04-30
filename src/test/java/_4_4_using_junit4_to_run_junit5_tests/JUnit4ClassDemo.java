package _4_4_using_junit4_to_run_junit5_tests;

import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

@RunWith(JUnit5.class)
public class JUnit4ClassDemo {

	@Test
	void aSucceedingTest() {

	}

	@Test
	void aFailingTest() {
//		fail("Failing for failing's sake.");
	}
}
