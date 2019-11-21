package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import adapter.MapList;

public class Cliente {

	
	public static void main(String[] args) {
		Map<Object, Object> map = new HashMap<Object, Object>();
		
		List<Object> list = new ArrayList<Object>();
		
		String nome = "Rodrigo";
		String nome2 = "Aline";
		String nome3 = "Pedro";
		
		MapList mapList = new MapList(map);
		
		mapList.add(nome);
		mapList.add(nome2);
		mapList.add(nome3);		
		
		for (int i = 0; i < mapList.toArray().length; i++) {
			System.out.println(mapList.toArray()[i]);
		}
		System.out.println();
		
		System.out.println("Contem Rodrigo? " + mapList.contains("Rodrigo"));

		System.out.println();
		
		System.out.println("É uma instância de List? " + (mapList instanceof List));
		
		System.out.println();
		
		System.out.println("Primeiro elemento = " + mapList.get(0));
		
		System.out.println();
		mapList.clear();
		System.out.println("Vazio? " + mapList.isEmpty());
		
		
		
	}
}
