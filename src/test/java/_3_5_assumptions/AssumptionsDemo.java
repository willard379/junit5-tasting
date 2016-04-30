package _3_5_assumptions;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.fail;
import static org.junit.gen5.api.Assumptions.assumeTrue;
import static org.junit.gen5.api.Assumptions.assumingThat;

import org.junit.gen5.api.Test;

class AssumptionsDemo {

	@Test
	void testOnlyOnCiServer() {
		assumeTrue("CI".equals(System.getenv("ENV")));
		fail("Not on CI");
	}

	@Test
	void testOnlyOnDeveloperWorkstation() {
		assumeTrue("DEV".equals(System.getenv("ENV")), () -> "Aborting test: not on developer workstation");
	}

	@Test
	void testInAllEnvironments() {
		assumingThat("CI".equals(System.getenv("ENV")), () -> {
			assertEquals(2, 2);
		});

		assertEquals("a string", "a string");
	}

}
