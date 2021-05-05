public class Main {
	public static void main(String []args) {
		
		//FOR
			//Execute i times
		for(int i= 0; i <=10; i++) {
			System.out.println("Iteracao for: "+ i);
		}
		
		//WHILE
			//Test the condition, then executes
		int j = 0;
		
		while(j <10) {
			System.out.println("Iteracao while: "+ j);
			j++;
		}
		
		//DO WHILE
			//Execute then test the conditions
		int contj = 0;
		do {
			System.out.println("Iteracao do while: "+ contj);
			contj++;
		}while(contj < 0);
	}
}
