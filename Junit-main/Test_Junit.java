package Com.demo.test;
import Com.demo.main.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Test_Junit {
	@Test
	public void max() {
		
		assertEquals(8,Junit_Demo.max(new int[]{1,2,3,5,7,8}));
		assertEquals(-1,Junit_Demo.max( new int[]{-1,-2,-3,-5,-7,-8}));
	}
	
}
