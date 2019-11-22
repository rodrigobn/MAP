package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import adapter.ListMap;

public class TestListMap {
	List<Object> list = new ArrayList<Object>();
		
	@Test
	public void testContrutor() {
		ListMap listMap = new ListMap(list);
		
		assertTrue(listMap instanceof Map);
	}
	
	@Test
	public void testPut() {
		ListMap listMap = new ListMap(list);
		
		String nome1 = "Maria";
		String nome2 = "João";
		
		listMap.put(listMap.size(), nome1);
		assertEquals(listMap.size(), 1);
		
		listMap.put(listMap.size(), nome2);
		assertEquals(listMap.size(), 2);
		
		listMap.put(4, nome2);
		assertEquals(listMap.size(), 2);
		
		assertEquals(listMap.get(0), nome1);		
		assertEquals(listMap.get(1), nome2);
	}
	
	@Test
	public void testClear() {
		ListMap listMap = new ListMap(list);
		
		String nome1 = "Maria";
		
		listMap.put(listMap.size(), nome1);
		
		assertFalse(listMap.isEmpty());
		
		listMap.clear();
		
		assertEquals(listMap.get(0), null);
		assertTrue(listMap.isEmpty());
	}
	
	@Test
	public void testContains() {
		ListMap listMap = new ListMap(list);
		
		String nome1 = "Maria";
		
		listMap.put(listMap.size(), nome1);

		assertTrue(listMap.containsValue(nome1));
		
		listMap.remove(nome1);
		
		assertFalse(listMap.containsValue(nome1));
	}
	
	@Test
	public void testGet() {
		ListMap listMap = new ListMap(list);
		
		String nome1 = "Maria";
		
		listMap.put(listMap.size(), nome1);

		assertEquals(listMap.get(0), nome1);
		assertEquals(listMap.get(nome1), nome1);
	}
	
	@Test
	public void testIsEmpty() {
		ListMap listMap = new ListMap(list);
		
		String nome1 = "Maria";
		
		assertTrue(listMap.isEmpty());
		
		listMap.put(listMap.size(), nome1);

		assertFalse(listMap.isEmpty());
	}
	
	@Test
	public void testRemove() {
		ListMap listMap = new ListMap(list);
		
		String nome1 = "Maria";
		
		listMap.put(listMap.size(), nome1);
		
		assertTrue(listMap.containsValue(nome1));
		
		listMap.remove(nome1);
		
		assertFalse(listMap.containsValue(nome1));
	}
	
	@Test
	public void testSize() {
		ListMap listMap = new ListMap(list);
		
		String nome1 = "Maria";

		assertEquals(listMap.size(), 0);
		
		listMap.put(listMap.size(), nome1);
		
		assertEquals(listMap.size(), 1);
	}
}
