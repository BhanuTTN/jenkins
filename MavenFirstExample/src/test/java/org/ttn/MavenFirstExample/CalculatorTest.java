package org.ttn.MavenFirstExample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	
	@Test
	public void calTest1() {
		Calculator obj = new Calculator();
		assertEquals(15,obj.add(10, 5));
	}
	
	@Test
	public void calTest2() {
		Calculator obj = new Calculator();
		assertEquals(8,obj.sub(17,9));
	}
	
	@Test
	public void calTest3() {
		Calculator obj = new Calculator();
		assertEquals(30,obj.mul(5, 6));
	}
	
	@Test
	public void calTest4() {
		Calculator obj = new Calculator();
		assertEquals(9,obj.div(81, 9));
	}
}
