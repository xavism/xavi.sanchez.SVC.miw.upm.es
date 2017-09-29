package xavi.sanchez.SVC.miw.upm.es;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestC51 {

	private C51 obj;
	
	@Before
    public void before() {
        obj = new C51();
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
