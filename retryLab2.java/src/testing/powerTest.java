package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class powerTest {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		boolean output = test.powerOfTwo(4);
		assertEquals(2,output);
	}

}
