package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		
		myList.add(10);
		myList.add(20);
		myList.add(40);
		myList.add(70);
		
		System.out.println("Element at index 3 : "+ myList.get(2));
		
		System.out.println("Elements in the List");
		for (Integer num : myList) {
			System.out.println(num);
		}
	}

}
