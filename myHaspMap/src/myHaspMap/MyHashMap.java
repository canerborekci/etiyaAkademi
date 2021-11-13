package myHaspMap;

public class MyHashMap<K, V> {
	Object[] keys;
	Object[] values;

	public MyHashMap() {
		keys = new Object[0];
		values = new Object[0];
	}

	public void put(K key, V value) {
		Object[] tempKeys = keys;
		Object[] tempValues = values;
		keys = new Object[keys.length + 1];
		values = new Object[values.length + 1];
		for (int i = 0; i < tempKeys.length; i++) {
			keys[i] = tempKeys[i];
			values[i] = tempValues[i];
		}
		keys[keys.length - 1] = key;
		values[values.length - 1] = value;
	}

	public Object get(K key) {
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] == key) {
				return values[i];
			}
		}
		return "Key not found";
	}

	public void remove(K key) {
		Object[] tempKeys = new Object[keys.length - 1];
		Object[] tempValues = new Object[values.length - 1];
		int j = 0;
		for (int i = 0; i < keys.length - 1; i++) {
			if (keys[i] != key) {
				tempKeys[i] = keys[j];
				tempValues[i] = values[j];
				j++;

			}
			if (keys[i] == key) {
				j = i + 1;
				tempKeys[i] = keys[j];
				tempValues[i] = values[j];
				j++;

			}

		}
		keys = tempKeys;
		values = tempValues;

	}

	public void listAll() {
		for (int i = 0; i < keys.length; i++) {
			System.out.println(keys[i] + "  ===>   " + values[i]);
		}
	}
	
	public void clear() {
		keys = new Object[0];
		values = new Object[0];
	}
	
	public int size() {
		return keys.length;
	}

}
