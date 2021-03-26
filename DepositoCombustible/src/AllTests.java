import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DepositoCombustibleTest.class })
public class AllTests {
	private int depMax;
    private int depNivel;
	
	
	
	@Test
	public void testDepositoCombustible() {
		int res=depNivel;
		assertEquals(20,res);	
	}

	@Test
	public void testGetDepositoNivel() {
		int res=depNivel;
		assertEquals(0,res);
	}

	@Test
	public void testGetDepositoMax() {
		int res=depMax;
		assertEquals(40,res);
	}

	@Test
	public void testEstaVacio() {
		int res=depNivel;
		assertEquals(0,res);
	}

	@Test
	public void testEstaLleno() {
		int res=depNivel;
		assertEquals(40,res);
	}

	@Test
	public void testFill() {
		DepositoCombustible d = new DepositoCombustible(0,30);
		int res = depNivel;
		assertEquals(30,res);
	}

	@Test
	public void testConsumir() {
		DepositoCombustible d = new DepositoCombustible(0,30);
		int res = depNivel;
		assertEquals(30,res);
	}

}
