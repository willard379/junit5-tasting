package _3_7_tagging_and_filtering;

import org.junit.gen5.api.Tag;
import org.junit.gen5.api.Test;

@Tag("fast")
@Tag("model")
class TaggingDemo {

	@Test
	@Tag("taxes")
	void testingTaxCalculation() {
		
	}
}
