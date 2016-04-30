package _5_ExtensionModel;

import org.junit.gen5.api.extension.InstancePostProcessor;
import org.junit.gen5.api.extension.TestExtensionContext;

public class InstancePostPrintlnProcessor implements InstancePostProcessor {

	private final String message;

	public InstancePostPrintlnProcessor(String message) {
		this.message = message;
	}

	@Override
	public void postProcessTestInstance(TestExtensionContext context) throws Exception {
		System.out.println(message);
	}

}
