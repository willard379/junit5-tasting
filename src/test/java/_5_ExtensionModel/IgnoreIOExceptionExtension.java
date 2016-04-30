package _5_ExtensionModel;

import java.io.IOException;

import org.junit.gen5.api.extension.ExceptionHandlerExtensionPoint;
import org.junit.gen5.api.extension.TestExtensionContext;

public class IgnoreIOExceptionExtension implements ExceptionHandlerExtensionPoint {

	@Override
	public void handleException(TestExtensionContext context, Throwable throwable) throws Throwable {
		if (throwable instanceof IOException) {
			System.out.println("IOException occured");
			return;
		}
		throw throwable;
	}

}
