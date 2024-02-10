package Collection;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Parashuram");
		names.add("Prajwal");
		names.add("Lalu");
		
		System.out.println("First Name : "+ names.get(0));
		System.out.println("Second Name : "+ names.get(1));
		System.out.println("Third Name : "+ names.get(2));
		
		System.out.println("All Names");
		for (String name : names) {
			System.out.println(name);
		}
			
			System.out.println("Number of names : "+ names.size());
			
			names.remove(2);
			
			System.out.println("Names after removing Lalu : "+ names);
	}

}
