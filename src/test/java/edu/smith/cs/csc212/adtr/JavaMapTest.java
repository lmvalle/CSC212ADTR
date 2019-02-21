package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {

	void assertIntEq(int x, int y) {
		assertEquals(x,y);
	}
	@Test
	public void testEmpty() {
		MapADT<String, Integer> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
	}
	@Test
	public void testPut() {
		MapADT<String, Integer> vari = new JavaMap<>();
		vari.put("a", 1);
		vari.put("A", 1);
		assertEquals(vari.size(), 2);
	}
	@Test
	public void testGet() {
		MapADT<String, Integer> vari = new JavaMap<>();
		vari.put("a", 1);
		vari.put("A", 1);
		assertEquals(vari.get("a"),vari.get("A"));
	}
	@Test
	public void testRemove() {
		MapADT<String,Integer> vari = new JavaMap<>();
		vari.put("a",1);
		vari.put("A", 1);
		vari.remove("A");
		assertEquals(vari.size(),4s);
	}
}
