package afik;

import static org.junit.Assert.*;

import org.junit.Test;

public class Apptest {
	App appobject = new App();
	
	@Test
	public void isReturnsHello() {
		assertEquals("Hello", appobject.returnHello());
	}

}
