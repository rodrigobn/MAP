package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import adapter.ListMap;
import adapter.MapList;

public class Cliente {

	
	public static void main(String[] args) {
		Map<Object, Object> map = new HashMap<Object, Object>();
		
		List<Object> list = new ArrayList<Object>();
		
		String nome = "Rodrigo";
		String nome2 = "Aline";
		String nome3 = "Pedro";
		
		System.out.println("###### MapList ######");
		System.out.println();
		MapList mapList = new MapList(map);
		
		mapList.add(nome);
		mapList.add(nome2);
		mapList.add(nome3);		
		System.out.println("Map de nomes:");
		System.out.println();
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
		System.out.println("tamanho? " + mapList.size());
		
		System.out.println();
		mapList.clear();
		System.out.println("Vazio? " + mapList.isEmpty());
		
		ListMap listMap = new ListMap(list);
		
		System.out.println();
		System.out.println("###### MapList ######");
		System.out.println();
		
		listMap.put(0, nome);
		listMap.put(1, nome2);
		listMap.put(2, nome3);
		
		System.out.println("Primeiro Nome da lista: " + listMap.get(0));
		System.out.println();
		
		System.out.println("Tamanho: " + listMap.size());
		System.out.println();
		
		System.out.println("Instancia: " + (listMap instanceof Map));
		System.out.println();
		
		listMap.remove(nome);
		
		System.out.println("Tamanho apos remocao: " + listMap.size());
		System.out.println();
		
		System.out.println("Vazia? " + listMap.isEmpty());
		System.out.println();
		listMap.clear();
		System.out.println("Vazia apos o clean? " + listMap.isEmpty());
		System.out.println();
	}
}
