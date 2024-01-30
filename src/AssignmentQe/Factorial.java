package AssignmentQe;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	System.out.println("Enter A Number");
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	int fact=1;
	
	for (int i=no; i>1; i--) {
		fact = fact*i;
	}
	System.out.println(fact);
}
}
