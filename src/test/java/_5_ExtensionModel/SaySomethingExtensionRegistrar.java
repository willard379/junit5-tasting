package _5_ExtensionModel;

import org.junit.gen5.api.extension.ExtensionPointRegistry;
import org.junit.gen5.api.extension.ExtensionPointRegistry.Position;
import org.junit.gen5.api.extension.ExtensionRegistrar;

public class SaySomethingExtensionRegistrar implements ExtensionRegistrar {

	@Override
	public void registerExtensions(ExtensionPointRegistry registry) {
		// BeforeAllExtension
		registry.register(new BeforeAllPrintlnExtension("OUTERMOST"), Position.OUTERMOST);
		registry.register(new BeforeAllPrintlnExtension("OUTSIDE_DEFAULT"), Position.OUTSIDE_DEFAULT);
		registry.register(new BeforeAllPrintlnExtension("INSIDE_DEFAULT"), Position.INSIDE_DEFAULT);
		registry.register(new BeforeAllPrintlnExtension("INNERMOST"), Position.INNERMOST);
		
		// TestExecutionCondition
		registry.register(new TestExecutionPrintlnCondition("TestExecutionCondition"));
		
		// InstancePostProcessing
		registry.register(new InstancePostPrintlnProcessor("InstancePostProcessor"), Position.OUTERMOST);

		// ExceptionHandlerExtensionPoint
		registry.register(new IgnoreIOExceptionExtension());
	}

}
