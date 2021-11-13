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
		String[] temp = new String[list.length-1];
		int j=0;
		for (int i = 0; i < list.length-1; i++) {
			if (list[i] != removeItem) {
				temp[i] = list[j];
				j++;
			} 
			if (list[i] == removeItem) {
				j=i+1;
				temp[i]=list[j];
				j++;
			}
		}
		list=temp;



	}

	public void removeIndex(int index) {
		String[] temp = new String[list.length-1];
		int j = 0;
		for (int i = 0; i < list.length-1; i++) {
			if (i != index) {
				temp[i] = list[j];
				j++;
			} 
			if (i == index){
				j=i+1;
				temp[i]=list[j];
				j++;
			}

		}
		list=temp;
		


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


	public void list() {
		for (int i = 0; i < list.length; i++) {
		
				System.out.println(list[i]);
			
		}
	}
}