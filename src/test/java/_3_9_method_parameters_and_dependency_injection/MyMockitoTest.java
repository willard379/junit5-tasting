package _3_9_method_parameters_and_dependency_injection;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;

import com.example.mockito.InjectMock;
import com.example.mockito.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MyMockitoTest {

	@BeforeEach
	void init(@InjectMock Person person) {
		when(person.getName()).thenReturn("Dilbert");
	}
	
	@Test
	void simpleTestWithInjectedMock(@InjectMock Person person) {
		assertEquals("Dilbert", person.getName());
	}
}

interface Person {
	String getName();
}