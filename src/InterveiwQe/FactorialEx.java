package InterveiwQe;
import java.util.Scanner;
public class FactorialEx {
	public static int Fact() {
		System.out.println("Enter a nmumber");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int fact = 1;
		for (int i=no; i>=1; i--) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		int x = Fact();
		System.out.println(x);
	}
}
