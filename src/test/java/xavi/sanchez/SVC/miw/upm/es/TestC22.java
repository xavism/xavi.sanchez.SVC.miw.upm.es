package xavi.sanchez.SVC.miw.upm.es;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestC22 {

	private C22 obj;
	
	@Before
    public void before() {
        obj = new C22();
    }
	
	@Test
	public void testM1() {
		assertEquals("mA", obj.mA());
	}

}
