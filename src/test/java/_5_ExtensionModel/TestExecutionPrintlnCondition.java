package _5_ExtensionModel;

import org.junit.gen5.api.extension.ConditionEvaluationResult;
import org.junit.gen5.api.extension.TestExecutionCondition;
import org.junit.gen5.api.extension.TestExtensionContext;

public class TestExecutionPrintlnCondition implements TestExecutionCondition {

	private final String message;

	public TestExecutionPrintlnCondition(String message) {
		this.message = message;
	}

	@Override
	public ConditionEvaluationResult evaluate(TestExtensionContext context) {
		System.out.println(message);
		return ConditionEvaluationResult.enabled("");
	}

}
