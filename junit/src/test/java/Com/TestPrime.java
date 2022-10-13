package Com;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestPrime {
	@Test
	public void testprime() {
		assertEquals(false,Prime.prime(4));  
        assertEquals(true,Prime.prime(3));
        assertEquals(false,Prime.prime(10));
        assertEquals(false,Prime.prime(1));
	}
}

