package xavi.sanchez.SVC.miw.upm.es;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestC52 {

	private C52 obj;
	
	@Before
    public void before() {
        obj = new C52();
    }
	
	@Test
	public void testM1() {
		assertEquals("mA", obj.mA());
	}

}
