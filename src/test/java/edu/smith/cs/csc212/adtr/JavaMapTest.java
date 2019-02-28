package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
//Make static map to reference in test
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
		vari.remove("a");
		this.assertIntEq(vari.size(),0);
	
	}
	@Test
	public void testGetKey() {
		MapADT<String,Integer> vari = new JavaMap<>();
		vari.put("a",1);
		vari.put("b",2);
		vari.put("c", 3);
		ListADT<String> letters = vari.getKeys();
		assertEquals(letters.size(),3);
	}
	@Test
	public void testGetEntries() {
		MapADT<String,Integer> vari = new JavaMap<>();
		vari.put("a",1);
		vari.put("b",2);
		vari.put("c", 3);
		ListADT<Pair<String,Integer>> pairs = vari.getEntries();
		assertEquals(pairs.size(),3);
	}
	@Test
	public void testToJava() {
		MapADT<String,Integer> vari = new JavaMap<>();
		vari.put("a",1);
		vari.put("b",2);
		vari.put("c", 3);
		Map<String,Integer> keep = vari.toJava();
		assertEquals(keep.size(),3);
		
	}
}
