package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> mySet = new HashSet<>();
		mySet.add("Bangalore");
		mySet.add("Belgaum");
		mySet.add("Mysore");
		mySet.add("Belgaum");
		
		System.out.println("Elements in the set : ");
		for (String name : mySet) {
			System.out.println(name);
		}
	}

}
