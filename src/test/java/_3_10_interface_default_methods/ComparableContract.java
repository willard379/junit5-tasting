package _3_10_interface_default_methods;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertTrue;

import org.junit.gen5.api.Test;

public interface ComparableContract<T extends Comparable<T>> extends Testable<T> {

	T createSmallerValue();

	@Test
	default void returnsZeroWhenComparedToItself() {
		T value = createValue();
		assertEquals(0, value.compareTo(value));
	}

	@Test
	default void returnsPositiveNumberComparedToSmallerValue() {
		T value = createValue();
		T smallerValue = createSmallerValue();
		assertTrue(value.compareTo(smallerValue) > 0);
	}

	@Test
	default void returnsNegativeNumberComparedToSmallerValue() {
		T value = createValue();
		T smallerValue = createSmallerValue();
		assertTrue(smallerValue.compareTo(value) < 0);
	}
}
