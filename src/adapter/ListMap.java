package adapter;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListMap implements Map<Object, Object> {

	List<Object> list;
	
	public ListMap(List<Object> list) {
		this.list = list;
	}
	
	@Override
	public void clear() {
		this.list.clear();
		
	}

	@Override
	public boolean containsKey(Object key) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsValue(Object value) {
		return this.list.contains(value);
	}

	@Override
	public Set<Entry<Object, Object>> entrySet() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object get(Object element) {
		if (this.list.contains(element)) {
			for (int i = 0; i < this.list.size(); i++) {
				if (this.list.get(i) == element) {
					return this.list.get(i);
				}
			}
		}
		return null;
	}
	
	public Object get(int index) {
		for (int i = 0; i < this.list.size(); i++) {
			if (i == index) {
				return this.list.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	@Override
	public Set<Object> keySet() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object put(Object index, Object element) {
		if (index instanceof Integer) {
			if (this.list.size() <= (int) index) {
				this.list.add((int) index, element);
				return element;
			}
		}		
		return null;
	}
	
	public Object put(int index, Object element) {
		if (this.list.size() <= index) {
			this.list.add(index, element);
			return element;
		}
		return null;		
	}

	@Override
	public void putAll(Map<? extends Object, ? extends Object> m) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public Object remove(Object element) {
		if (this.list.contains(element)) {
			this.list.remove(element);
		}
		return null;
	}

	@Override
	public int size() {
		return this.list.size();
	}

	@Override
	public Collection<Object> values() {
		throw new UnsupportedOperationException();
	}

}
