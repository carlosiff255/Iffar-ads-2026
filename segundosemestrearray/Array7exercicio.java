package segundosemestrearray;
import java.util.Scanner;

public class Array7exercicio {

	public static void main(String[] args) {
		// Faça um programa que leia 10 números inteiros e armazene em um vetor. Após, some estes valores e mostre o resultado.

		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[10];
		int soma = 0;
		
		for (int i=0; i<10; i++) {
			System.out.print("Escreva um número inteiro(" + (i+1) + "):");
			vetor[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			soma += vetor[i];
		}
		
		System.out.print("Resultado: " + soma);
		
		
	}

}
