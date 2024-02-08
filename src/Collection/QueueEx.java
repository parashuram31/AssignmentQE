package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<String> myQueu = new LinkedList<>();
		
		myQueu.add("Parashuram");
		myQueu.add("Prajwal");
		myQueu.add("Lalu");
		
		while (!myQueu.isEmpty()) {
			System.out.println("Prosessing "+ myQueu.poll());
		}
	}

}
