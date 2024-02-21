package InterveiwQe;

import java.util.Scanner;

public class PrimeNoEx {
	public static boolean Prime() {
		System.out.println("Enter A Number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		boolean flag = true;
		for (int i=2; i<no; i++) {
			if (no%i==0) {
			flag = false;
			break;
		}
		}
		if (flag == true) {
			System.out.println("Prime No");
			return true;
		}
		else {
			System.out.println("Not a Prime No");
			return false;
		}
	}
	
	public static void main(String[] args) {
		boolean x= Prime();
		System.out.println(x);
		
	}
}
