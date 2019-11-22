package adapter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MapList implements List<Object> {

	private Map<Object, Object> map;
	
	public MapList(Map<Object, Object> map) {
		this.map = map;
	}
	
	@Override
	public boolean add(Object e) {
		int key = map.size();
		if (key == 0) {
			map.put(key, e);
			return true;
		}else {
			map.put(key, e);
			return true;
		}
	}

	@Override
	public void add(int index, Object element) {
		map.put(index, element);
	}

	@Override
	public boolean addAll(Collection<? extends Object> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends Object> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		map.clear();
		
	}

	@Override
	public boolean contains(Object o) {
		return map.containsValue(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object get(int index) {
		return map.get(index);
	}

	@Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public Iterator<Object> iterator() {
		
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<Object> listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<Object> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object o) {
		if (!this.map.isEmpty()) {
			map.remove(o);
			return true;
		}
		return false;		
	}

	@Override
	public Object remove(int index) {
		return map.remove(index);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object set(int index, Object element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public List<Object> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object [map.size()];
		
		for (int i = 0; i < map.values().size(); i++) {
			array[i] = map.values().toArray()[i];
		}
		
		return array;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

}
