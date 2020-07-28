package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class CalculatorTest extends Calculator {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	@Test
	public void testAdd() {
		
		Calculator c = new Calculator();
		assertEquals(a + b,c.add(a,b));
		
	}

	@Test
	public void testSub() {
		Calculator c = new Calculator();
		assertEquals(a - b,c.sub(a,b));
	}
}
