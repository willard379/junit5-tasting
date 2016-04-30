package _5_ExtensionModel;

import java.io.IOException;

import org.junit.gen5.api.AfterAll;
import org.junit.gen5.api.AfterEach;
import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

@RunWith(JUnit5.class)
@ExtendWith(SaySomethingExtensionRegistrar.class)
public class SampleTest {

	public SampleTest() {
		System.out.println("Constructor");
	}

	@BeforeAll
	public static void setUpBeforeAll() {
		System.out.println("@BeforeAll");
	}

	@BeforeEach
	public void setUp() {
		System.out.println("@BeforeEach");
	}

	@Test
	public void test1() {
		System.out.println("@Test");
	}

	@Test
	public void test2() throws IOException {
		System.out.println("@Test");
		throw new IOException();
	}

	@AfterEach
	public void tearDown() {
		System.out.println("@AfterEach");
	}

	@AfterAll
	public static void tearDownAll() {
		System.out.println("@@AfterAll");
	}
}
