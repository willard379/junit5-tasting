package _3_9_method_parameters_and_dependency_injection;

import java.util.HashMap;
import java.util.Map;

import org.junit.gen5.api.Test;
import org.junit.gen5.api.TestReporter;

class TestReporterDemo {

	@Test
	void reportSingleValue(TestReporter testReporter) {
		testReporter.publishEntry("a key", "a value");
	}
	
	@Test
	void reportSeveralValues(TestReporter testReporter) {
		Map<String, String> values = new HashMap<>();
		values.put("user name", "dk38");
		values.put("award year", "1974");
		
		testReporter.publishEntry(values);
	}
}
