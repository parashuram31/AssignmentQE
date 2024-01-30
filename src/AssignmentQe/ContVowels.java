package AssignmentQe;

import java.util.Scanner;

public class ContVowels {
public static void main(String[] args) {
	System.out.println("Enter A String");
	Scanner sc = new Scanner(System.in);
	String Str = sc.nextLine();
	int count = 0;
	
	for (int i=0; i<Str.length(); i++) {
		char ch = Str.charAt(i);
		
		if(ch=='A'||ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			count++;
		}
	}
	System.out.println(count);
}
}
