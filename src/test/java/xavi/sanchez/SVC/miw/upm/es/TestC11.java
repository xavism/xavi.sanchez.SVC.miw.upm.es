package xavi.sanchez.SVC.miw.upm.es;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestC11 {

	private C11 obj;
	
	@Before
    public void before() {
        obj = new C11();
    }
	
	@Test
	public void testM1() {
		assertEquals("m1", obj.m1());
	}
	
	@Test
	public void testM2() {
		assertEquals("m2", obj.m2());
	}

}
