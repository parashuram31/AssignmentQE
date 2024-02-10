package Collection;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<String> color = new Vector<>();
		
		color.add("Red");
		color.add("Blue");
		color.add("Black");
		
		System.out.println("First Color : "+ color.get(0));
		System.out.println("First Color : "+ color.get(1));
		System.out.println("First Color : "+ color.get(2));
		
		System.out.println("All colors");
		for (String colors : color) {
			System.out.println(colors);
		}
		System.out.println("Number of colors : "+ color.size());
		
		color.remove(2);
		
		System.out.println("Colors after removing Black : "+ color);
	}

}
