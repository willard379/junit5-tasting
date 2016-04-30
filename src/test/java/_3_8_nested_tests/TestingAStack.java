package _3_8_nested_tests;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertFalse;
import static org.junit.gen5.api.Assertions.assertNotNull;
import static org.junit.gen5.api.Assertions.assertTrue;
import static org.junit.gen5.api.Assertions.expectThrows;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Nested;
import org.junit.gen5.api.Test;

@DisplayName("A stack")
class TestingAStack {

	Stack<Object> stack;
	boolean isRun = false;

	@Test
	@DisplayName("is instantiated with new Stack()")
	void isInstantiatedWithNew() {
		new Stack<Object>();
	}

	@Nested
	@DisplayName("when new")
	class WhenNew {

		@BeforeEach
		void init() {
			stack = new Stack<>();
		}

		@Test
		@DisplayName("is empty")
		void isEmpty() {
			assertTrue(stack.isEmpty());
		}

		@Test
		@DisplayName("throws EmptyStackException when popped")
		void throwsExceptionWhenPopped() {
			expectThrows(EmptyStackException.class, () -> {
				stack.pop();
			});
		}

		@Test
		@DisplayName("throws EmptyStackException when peeked")
		void throwsExceptionWhenPeeked() {
			expectThrows(EmptyStackException.class, () -> {
				stack.peek();
			});
		}
	}

	@Nested
	@DisplayName("after pushing an element")
	class AfterPushing {

		String anElement = "an element";

		@BeforeEach
		void init() {
			stack = new Stack<>();
			stack.push(anElement);
		}

		@Test
		@DisplayName("it is no longer empty")
		void isEmpty() {
			assertFalse(stack.isEmpty());
		}

		@Test
		@DisplayName("returns the element when popped and is empty")
		void returnElementWhenPopped() {
			assertEquals(anElement, stack.pop());
			assertTrue(stack.isEmpty());
		}

		@Test
		@DisplayName("returns the element when peeked but remains not empty")
		void returnElementWhenPeeked() {
			assertEquals(anElement, stack.peek());
			assertFalse(stack.isEmpty());
		}
	}

	@Nested
	class DeepTest1 {
		@Nested
		class DeepTest2 {
			@Nested
			class DeepTest3 {
				@Nested
				class DeepTest4 {
					// 任意の深さでネストできる
					@Test
					void succeedingTest() {

					}

					@Test
					void failingTest() {
						// fail("fail");
					}
				}
			}
		}
	}

	@Nested
	static class StaticClassTest1 {
		@Nested
		static class StaticClassTest2 {
			@Nested
			static class StaticClassTest3 {
				@Nested
				static class StaticClassTest4 {
					// Enclosedと同じく、staticなネストクラスも使える
					@Test
					void failingTest() {
						// fail("fail");
					}
				}
			}
		}
	}

	@Nested
	class NonStaticInnerClassTest {
		// non-staticなインナークラスはstaticなメンバーを持てないため、
		// @BeforeAll、@AfterAllは使えない

		// @BeforeAll
		// static void initAll() {}
		//
		// @AfterAll
		// static void tearDownAll() {}
	}

	@Nested
	static class StaticInnerClassTest {
		static Object object;

		// staticなインナークラスなら使える
		@BeforeAll
		static void initAll() {
			object = new Object();
		}

		@Test
		void objectIsNotNull() {
			assertNotNull(object);
		}
	}
}
