package AssignmentQe;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NoPalindrom {
public static void main(String[] args) {
	System.out.println("Enter A Number");
	Scanner sc = new Scanner(System.in);
	int no= sc.nextInt();
	int copy=no;
	int rev=0;
	
	while (no!=0) {
		int rem = no%10;
		rev = (rev*10)+rem;
		no=no/10;
	}
	if (copy==rev) {
		System.out.println("Number is palindrome");
	}else {
		System.out.println("Number is not a palindrome");
	}
}
}
