package xavi.sanchez.SVC.miw.upm.es;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestC32 {

	private C32 obj;
	
	@Before
    public void before() {
        obj = new C32();
    }
	
	@Test
	public void testM1() {
		assertEquals("mA", obj.mA());
	}

}
