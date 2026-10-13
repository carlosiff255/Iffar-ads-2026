package segundosemestrearray;
import java.util.Random;
import java.util.Scanner;
public class Array15exercicio {

	public static void main(String[] args) {
		// Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e 15 sorteados pelo computador. 
		// Depois disso, peça para o usuário digitar um número (chave) e seu programa deve mostrar em que posições essa chave foi encontrada. Mostre também quantas vezes a chave foi sorteada.

		Random random = new Random();
		Scanner teclado = new Scanner(System.in);
		
		int vetor[] = new int[30];
		int digitado[] = new int[5];
		int acertados = 0; 
		
		for (int i = 0; i < 30; i++) { 
			vetor[i] = random.nextInt(15); 
		
			if (i==29) {
				for (int e = 0; e < 5; e++) {
					
					if (e==0) { //ok
						System.out.print("Me diga um valor de 0-15");
					}
					
				digitado[e] = teclado.nextInt();
				
				 for (int b = 0; b < 30; b++) {
					 if (digitado[e] == vetor[b]) {
						  System.out.println("Acertou o número " + digitado[e] + " na posição " + (b+1));
						  vetor[b] = -1;
					 	}
				 	}
				}
			}
		}
	}
}
