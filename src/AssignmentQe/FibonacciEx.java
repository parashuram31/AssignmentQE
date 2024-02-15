package AssignmentQe;

public class FibonacciEx {
	    public static void generateFibonacci(int n) {
	        int prev = 0, curr = 1;
	        System.out.print("Fibonacci series up to " + n + " terms: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(prev + " ");
	            int next = prev + curr;
	            prev = curr;
	            curr = next;
	        }
	    }

	    public static void main(String[] args) {
	        int terms = 10;
	        generateFibonacci(terms);
	    }
	}

