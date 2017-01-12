package practica2EGC;

import static org.junit.Assert.*;

import org.junit.Test;

import resta.Resta;

public class restaTest {

	 int resta(int i, int j) {
		return Resta.resta(i,j);
	}
	
	@Test
	public void testResta() {
		assertEquals(4,resta(6,2));
	}
	
	@Test
	public void testRestaCon0() {
		assertEquals(4,resta(4,0));
		assertEquals(-4,resta(0,4));
	}
	
	@Test
	public void testRestaConNegativos() {
		assertEquals(8,resta(6,-2));
		assertEquals(4,resta(2,-2));
	}
	
	
	



}
