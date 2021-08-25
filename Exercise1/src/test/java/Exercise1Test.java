import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise1Test {

	@Test
	public void helloTest() {
		Exercise1 obj = new Exercise1();
		String result = obj.hello();
		
		assertEquals("Hello World", result);
	}
}
