package _3_1_annotations;

import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

@RunWith(JUnit5.class)
class MetaAnnotationTest {

	@Fast
	@Test
	void fastTest() {
	}

	@Test
	void slowTest() {

	}
}
