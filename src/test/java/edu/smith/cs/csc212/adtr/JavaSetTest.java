package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;


public class JavaSetTest {
//make static setnto test 	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	@Test
	public void testInsert() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("a");
		abc.insert("b");
		abc.insert("c");
		assertEquals(abc.size(),3);
	}
	@Test
	public void testInsertRepeated() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("A");
		abc.insert("A");
		abc.insert("A");
		assertEquals(abc.size(),1);
	}
	@Test
	public void testSize() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("a");
		abc.insert("b");
		abc.insert("c");
		abc.insert("d");
		assertEquals(abc.size(),4);
	}
	@Test
	public void testContains() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("e");
		abc.insert("f");
		abc.insert("g");
		assertEquals(abc.contains("e"),true);
	}
	@Test
	public void testRemove() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("a");
		abc.insert("A");
		abc.remove("A");
		assertEquals(abc.size(), 1);
	}
	@Test
	public void testToList() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("a");
		ListADT<String> dfg = abc.toList();
		assertEquals(dfg.size(),1);
	}
	@Test
	public void testToJava() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("a");
		abc.insert("b");
		Set<String> dfg = abc.toJava();
		assertEquals(dfg.size(), 2);
	}
}
