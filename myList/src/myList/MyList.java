package myList;

public class MyList {
	String[] list;

	public MyList() {
		this.list = new String[0];
	}

	public String[] add(String item) {
		String[] temp = new String[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			temp[i] = list[i];
		}
		temp[temp.length - 1] = item;
		list = new String[temp.length];
		for (int i = 0; i < temp.length; i++) {
			list[i] = temp[i];

		}
		return list;

	}

	public void remove(String removeItem) {
		String[] temp = new String[list.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = list[i];
		}
		list = new String[temp.length];
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != removeItem) {
				list[i] = temp[i];
			} else {
				continue;
			}

		}

	}

	// remove edemedim ancak istenen değerler null oldu.
	public void removeIndex(int index) {
		String[] temp = new String[list.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = list[i];
		}
		list = new String[temp.length];
		for (int i = 0; i < temp.length; i++) {
			if (i != index) {
				list[i] = temp[i];
			} else {
				continue;
			}

		}

	}

	public boolean contains(String contain) {
		boolean status = false;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != contain) {
				status = false;
			} else {
				status = true;
				break;
			}
		}
		return status;

	}

	// listelerken null değerleri listelemedim, program doğru sonuç verdi ancak
	// indeksler ile çalışmak için sağlıklı değil.
	public void list() {
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				System.out.println(list[i]);
			} else {
				continue;
			}
		}
	}
}