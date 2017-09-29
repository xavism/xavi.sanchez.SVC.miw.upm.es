package xavi.sanchez.SVC.miw.upm.es;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestC12 {

	private C12 obj;
	
	@Before
    public void before() {
        obj = new C12();
    }
	
	@Test
	public void testMA() {
		assertEquals("mA", obj.mA());
	}

}
