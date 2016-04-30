package _5_ExtensionModel;

import org.junit.gen5.api.extension.BeforeAllExtensionPoint;
import org.junit.gen5.api.extension.ContainerExtensionContext;

public class BeforeAllPrintlnExtension implements BeforeAllExtensionPoint {

	private final String message;
	
	public BeforeAllPrintlnExtension(String message) {
		this.message = message;
	}

	@Override
	public void beforeAll(ContainerExtensionContext context) throws Exception {
		System.out.println("@BeforeAll :" + message);
	}

}
