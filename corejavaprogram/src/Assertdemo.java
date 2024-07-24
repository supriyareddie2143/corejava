
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Assertdemo {
	@Test
public void Testforassertequal() {
	int res=1;
	int exp=1;
	assertEquals(res,exp);
}
	@Test
	void testasserttrue()
	{
		assertTrue("helow".contains("i"));
	}
	@Test
	void testnull()
	{
		String n="";
		assertNull("");
	}
}
