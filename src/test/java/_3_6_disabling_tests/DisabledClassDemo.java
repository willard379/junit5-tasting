package _3_6_disabling_tests;

import org.junit.gen5.api.Disabled;
import org.junit.gen5.api.Test;

@Disabled
class DisabledClassDemo {
	@Test
	void testWillBeSkipped() {
		
	}
}
