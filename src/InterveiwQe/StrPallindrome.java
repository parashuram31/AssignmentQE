package InterveiwQe;

import java.util.Scanner;

public class StrPallindrome {
	static boolean Pallindrome() {
    	System.out.println("Enter a String");
    	Scanner sc= new Scanner(System.in);
    	String str = sc.nextLine();
    	 str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    	String rev = "";
    	for (int i =str.length()-1; i>=0; i--) {
    		rev = rev+str.charAt(i);
    	}
    	if(str.equals(rev)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
     public static void main(String[] args) {
		boolean x = Pallindrome();
		System.out.println(x);
	}
}
