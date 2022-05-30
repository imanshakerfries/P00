import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered plagiarism
 *
 * Student Name: Iman Syakir
 * Student ID: 21014919
 * Class: W64N
 * Date/Time created: Monday 30-05-2022 12:14
 */

/**
 * @author 21014919
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a = 5;
		int b = 5;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		assertEquals (10, actual);
	}
	
	@Test
	public final void testSubtract() {
		int a = 10;
		int b = 5;
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		assertEquals (5, actual);
	}
	
	@Test
	public final void testMultiply() {
		int a = 10;
		int b = 10;
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		assertEquals (100, actual);
	}
	
	@Test
	public final void testDivide() {
		int a = 81;
		int b = 9;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		assertEquals (9, actual);
	}
	
//	@Test
//	public final void testDivide() {
//		int a = 0;
//		int b = 0;
//		Calculator cal = new Calculator();
//		int actual = cal.divide(a, b);
//		assertEquals (0, actual);
//	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
}
