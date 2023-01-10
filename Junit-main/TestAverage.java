package Com.demo.test;

import Com.demo.main.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAverage {
	@Test
	public void max() {		
		assertEquals(4,Junit_Average.average(new int[]{1,2,3,5,7,8}, 6));
		assertEquals(-4,Junit_Average.average( new int[]{-1,-2,-3,-5,-7,-8}, 6));
	}	
}
