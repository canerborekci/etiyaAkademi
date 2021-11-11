package myList;

public class Main {

	public static void main(String[] args) {
		MyList list = new MyList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.remove("3");
		list.removeIndex(5);
		boolean result = list.contains("1");
		System.out.println(result);
		boolean result1 = list.contains("23");
		System.out.println(result1);
		list.list();
		
		
		

	}

}
