package lists.arraylist;

public class Main {

	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();
		
		list.add("dipesh");
		list.add("ww");
		list.add("qw");
		list.add("fd");
		list.add("gt");
		
		list.remove(3);
		
		list.insertAt(2, "take this");
		
		System.out.println(list.get(1));
		
		System.out.println(list);

	}

}
