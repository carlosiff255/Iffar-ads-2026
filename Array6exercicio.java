package segundosemestrearray;
import java.util.Scanner;
public class Array6exercicio {

	public static void main(String[] args) {
		// Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor. 
		// No final, mostre quais são os números pares que foram digitados e em que posições 
		//eles estão armazenados.

		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número " + (i + 1) + ":");
			vetor[i] = teclado.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 0) { 
			System.out.println(vetor[i] + " e sua posição é: " + i);
			}
           
		}
		
	
		
	}

}
