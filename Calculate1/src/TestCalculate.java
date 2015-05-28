

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestCalculate {

	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
				{ 1, 1, 2 }, 
				{ -1, -1, -2 },
				{ -1, 1, 0 }, 
				{ 2147483647, 1, -2147483648 },
				{ -2147483648, -1, 2147483647 }
		});
	}
	
	private int leftVal;
	private int rightVal;
	private int expectedVal;

	public TestCalculate(int leftVal, int rightVal, int expectedVal) {
		super();
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		this.expectedVal = expectedVal;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testAdd() {
		// assertEquals(5, Calculate.add(1, 4));
		assertEquals(this.expectedVal, Calculate.add(this.leftVal, this.rightVal));
	}

	@Test
	public void testMinus() {
		assertEquals(-1, Calculate.minus(2, 3));
	}

	@Test
	public void testDivide() throws Exception {
		assertEquals(0, Calculate.divide(1, 4));
	}

	@Test
	public void testMultiply() {
		assertEquals(4, Calculate.multiply(1, 4));
	}

}
