import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: sbuff
 * Student ID: {type your id here}
 * Class: {type your class here}
 * Date/Time created: Thursday 26-05-2022 11:23
 */

/**
 * @author sbuff
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

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//Arrange
		a = 4321;
		b = 1234;
		Calculator cal = new Calculator();
		
		//Act
		int acutual = cal.add(a, b);
		
		//Assert
		int expected = 5555;
		assertEquals (expected, actual);
	}

}
