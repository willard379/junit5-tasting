package _3_10_interface_default_methods;

public class StringTests implements ComparableContract<String>, EqualsContract<String> {

	@Override
	public String createValue() {
		return "foo";
	}

	@Override
	public String createNotEqualValue() {
		return "bar";
	}

	@Override
	public String createSmallerValue() {
		return "baz";
	}

}
