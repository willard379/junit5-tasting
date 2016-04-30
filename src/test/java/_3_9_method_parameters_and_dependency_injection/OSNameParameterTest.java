package _3_9_method_parameters_and_dependency_injection;

import static org.junit.gen5.api.Assertions.assertTrue;

import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;

@ExtendWith(OSNameParameterResolver.class)
class OSNameParameterTest {

	@Test
	void osNameTest(String osName) {
		assertTrue(osName.toLowerCase().contains("windows"));
	}

}
