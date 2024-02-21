package InterveiwQe;

import java.util.Scanner;

public class FibonacciEx {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		disp(n);
	}
	
	public static void disp(int n) {
		int a=0;
		int b=1;
		System.out.println("Fibonacci sequence up to "+n+" term");
		for (int i=0;i<n;i++) {
			System.out.print(a+" ");
			int next = a+b;
			a= b;
			b=next;
		}
	}
}
