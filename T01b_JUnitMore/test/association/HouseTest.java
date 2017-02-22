package association;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HouseTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() {
	}
	
	@AfterClass
	public static void shutdown() {
	}
	

	@Test
	public void testAddDoor_tooMany_rejected() {
		House aHouse = new House( "Brambles", 4 );
			for (int i=0; i<=4; i++) {
				aHouse.addDoor( new Door("Front", i, true));
			}
		// TODO Assert that it threw IllegalStateException
		fail("not yet implemented");
	}

}
