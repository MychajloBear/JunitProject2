package artifact;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	void addTest() {
		int expected=ExampleClass.add(1, 2);
		int actual=3;
		assertEquals(expected, actual);
	}
	
	@Test
	void smallerThan100est() {
		boolean expected=ExampleClass.smallerThan100(2);
		boolean actual=true;
		assertEquals(expected, actual);
	}

}
