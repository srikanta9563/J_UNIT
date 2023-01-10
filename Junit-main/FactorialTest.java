package Com.demo.test;

import Com.demo.main.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FactorialTest {
	@Test
	public void test() {
		assertEquals(true,Factorial.fact(0));
		//assertEquals(false,Factorial.fact(4));
		//assertEquals(true,Factorial.fact(-1));
		//assertEquals(true,Factorial.fact(4));
	}
}
