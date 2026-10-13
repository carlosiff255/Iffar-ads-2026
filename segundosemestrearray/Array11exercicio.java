package segundosemestrearray;
import java.util.Scanner;
public class Array11exercicio {

	public static void main(String[] args) {
		// Leia e guarde em um vetor a idade de um grupo de 10 pessoas. Depois calcule e exiba na tela a quantidade de pessoas que possuem idade superior a 30 anos.
		
		Scanner teclado = new Scanner(System.in);	
		int idades[] = new int[11];
		int trinta = 0;
		int trintacomp = 30;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Escreva a idade da pessoa " + (i+1) + ":"); 
			idades[i] = teclado.nextInt();	
		}
		
		for(int i = 0; i < 11; i++) {
			 if (idades[i] > trintacomp) {
				trinta++;
			}
		}
		
		System.out.print("A quantidade de pessoas nesse grupo acima de 30 é: " + trinta++);
		
	}

}
