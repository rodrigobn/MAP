package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import adapter.MapList;

public class TestaMapList {
	Map<Object, Object> map = new HashMap<Object, Object>();
	

	@Test
	public void testContrutor() {
		MapList mapList = new MapList(map);
		
		assertTrue(mapList instanceof List);
	}
	
	@Test
	public void testAdd() {
		MapList mapList = new MapList(map);
		
		Integer numero = 1;
		String nome = "Maria";
		
		assertTrue(mapList.add(nome));
		assertTrue(mapList.add(numero));
		assertTrue(mapList.add(numero));
		
		assertEquals(mapList.get(0), nome);
		assertEquals(mapList.get(1), numero);
		assertEquals(mapList.get(2), numero);
		

		assertEquals(mapList.size(), 3);
	}
	
	@Test
	public void testClear() {
		MapList mapList = new MapList(map);
		
		Integer numero = 1;
		String nome = "Maria";
		
		mapList.add(nome);
		mapList.add(numero);
		
		assertEquals(mapList.get(0), nome);
		assertEquals(mapList.get(1), numero);
		
		mapList.clear();
		
		assertEquals(mapList.get(0), null);
		assertEquals(mapList.get(1), null);
	}
	
	@Test
	public void testContains() {
		MapList mapList = new MapList(map);
		
		Integer numero = 1;
		String nome = "Maria";
		
		mapList.add(nome);
		mapList.add(numero);
		
		assertTrue(mapList.contains(nome));
		assertTrue(mapList.contains(numero));
		assertFalse(mapList.contains(2));
	}
	
	@Test
	public void testGet() {
		MapList mapList = new MapList(map);
		
		String nome = "Maria";
		
		mapList.add(nome);
		
		assertEquals(mapList.get(0), nome);
	}
	
	@Test
	public void testIsEmpty() {
		MapList mapList = new MapList(map);
		
		String nome = "Maria";
		
		assertTrue(mapList.isEmpty());
		
		mapList.add(nome);
		
		assertFalse(mapList.isEmpty());
	}
	
	@Test
	public void testRemove() {
		MapList mapList = new MapList(map);
		
		String nome = "Maria";
		
		mapList.add(nome);
		
		assertTrue(mapList.contains(nome));
		
		mapList.remove(0);
		
		assertFalse(mapList.contains(nome));
	}
	
	@Test
	public void testSize() {
		MapList mapList = new MapList(map);
		
		String nome = "Maria";
		
		mapList.add(nome);
		
		assertEquals(mapList.size(), 1);
		
		mapList.clear();

		assertEquals(mapList.size(), 0);
	}
	
	@Test
	public void testToArray() {
		MapList mapList = new MapList(map);
		
		String nome = "Maria";
		
		mapList.add(nome);
		
		assertEquals(mapList.toArray().length, 1);
		assertEquals(mapList.toArray()[0], nome);
		
		mapList.clear();

		assertEquals(mapList.toArray().length, 0);
	}
}
