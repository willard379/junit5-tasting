package _3_6_disabling_tests;

import org.junit.gen5.api.Disabled;
import org.junit.gen5.api.Test;

class DisabledTestsDemo {

	@Disabled
	@Test
	void testWillBeSkipped() {
		
	}
	
	@Test
	void testWillBeExecuted() {
		
	}
}
