package xavi.sanchez.SVC.miw.upm.es;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestC31 {

	private C31 obj;
	
	@Before
    public void before() {
        obj = new C31();
    }
	
	@Test
	public void testM1() {
		assertEquals("m1", obj.m1());
	}
	
	@Test
	public void testM2() {
		assertEquals("m2", obj.m2());
	}
	
	@Test
	public void testMB() {
		assertEquals("mB", obj.mB());
	}

}
