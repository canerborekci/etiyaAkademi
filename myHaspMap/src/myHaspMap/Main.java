package myHaspMap;

public class Main {

	public static void main(String[] args) {
		MyHashMap<String, Integer> examResult = new MyHashMap<String, Integer>();
		
		examResult.put("Caner", 90);
		examResult.put("Ülkü", 100);
		examResult.put("Hakkı", 75);
		examResult.put("Mehmet", 10);
		
		System.out.println(examResult.get("Ülkü"));
		
		examResult.remove("Hakkı");
		
		System.out.println(examResult.size());
		
		//examResult.clear();
		
		examResult.listAll();

	}

}
