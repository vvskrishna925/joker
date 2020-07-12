import static org.junit.Assert.*;

import org.junit.Test;

public class AgeverTestnew {

	@Test
	public void testAgev() {
		Agever a = new Agever();
		assertEquals("NO RIGHT TO VOTE",a.agev(16));
	}

}
