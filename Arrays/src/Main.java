import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		//int[] num=new int[5];
			//variavel chamado num do tipo array de inteiro
			//novo array num de tamanho 5
		final int tam = 5; //declarando uma constante
		char[] respostas = new char[tam];
		char[] gabarito = {'a','c','d','d','b'};
		int nota = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int res = 0; res < respostas.length; res++) {
			
			System.out.printf("Resposta "+ res +": ");
			respostas[res] = scan.next().charAt(0);
		}
		for(int i = 0; i < gabarito.length; i++) {
			
			if(respostas[i] == gabarito[i]) {
				System.out.println(gabarito[i]+" Correto");
				nota++;
			}else{
				System.out.println(gabarito[i]+" Incorreto");
			}
		}
		
		System.out.printf("O aluno pontuou %d de %d", nota, tam);
	}
}
