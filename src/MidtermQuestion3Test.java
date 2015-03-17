import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import MainPackage.MyClass;


public class MidtermQuestion3Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReturnTrue() {
		assertTrue("The method ReturnTrue does not work", MyClass.ReturnTrue());
		
	}
	@Test
	public void testAddTwoNumbers(){
		assertEquals("The method AddTwoNumbers does not work", MyClass.AddTwoNumbers(2, 3),5);			
		}
		
}
