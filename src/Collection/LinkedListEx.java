package Collection;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Rabbit");
		
		System.out.println("First Animal : "+ animals.get(0));
		System.out.println("First Animal : "+ animals.get(1));
		System.out.println("First Animal : "+ animals.get(2));
		
		System.out.println("All Animals");
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println("Number of animals : "+ animals.size());
		
		animals.remove("Rabbit");
		
		System.out.println("Animals after removing Rabbit : " +animals);
	}

}
