package segundosemestrearray;
import java.util.Scanner;
public class Array12exercicio {

	public static void main(String[] args) {
		//  Crie um programa que receba e armazene em um vetor 5 números pares.
		// Se o usuário digitar um número ímpar, deve ser informado para digitar novamente até que um número par seja registrado no vetor. Após, exiba o vetor resultante na tela.

		Scanner teclado = new Scanner(System.in);	
		int numeros[] = new int[6];
		int numeroteste;
		
		System.out.println("Me digite apenas 5 números pares");
		
		for (int i = 0; i < 5; i++) {
			numeroteste = teclado.nextInt();
				if (numeroteste % 2 == 0) {
					System.out.println("Me digite novamente um número par:");
					numeros[i] = numeroteste;
				}
				else {
					System.out.println("Esse não é um número par, digite novamente");
					i--; //faz repetir.
				}
		
		
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Resposta: " + numeros[i]);;	
		}
		
	}

}
