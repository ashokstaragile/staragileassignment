package calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class unittest {

	@Test
	public void test() {
		calc calc = new calc();
		int sum = calc.sum(4, 4);
		assertEquals(8,sum);
	}
	
	@Test
	public void test1() {
		calc calc = new calc();
		int sub = calc.sub(4, 4);
		assertEquals(0,sub);
	}
	
	@Test
	public void test2() {
		calc calc = new calc();
		int mul = calc.mul(4, 4);
		assertEquals(16,mul);
	}
	
	@Test
	public void test3() {
		calc calc = new calc();
		int div = calc.div(4, 4);
		assertEquals(1,div);
	}

}
