import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = 0,n2 = 0,res = 0;
		
		System.out.println("Digite n1: ");
		n1 = scan.nextInt();
		System.out.println("Digite n2: ");
		n2 = scan.nextInt();
		
		res = n1 + n2;
		System.out.println("Soma �: "+res);
		}
}
