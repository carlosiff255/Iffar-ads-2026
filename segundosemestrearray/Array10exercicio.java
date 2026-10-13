package segundosemestrearray;
import java.util.Scanner;
public class Array10exercicio {

	public static void main(String[] args) {
		// Crie um vetor que receba 10 números inteiros digitados pelo usuário. Depois defina e mostre na tela o percentual de números pares e ímpares recebidos e armazenados no vetor.

		Scanner teclado = new Scanner(System.in);
		int numeros[] = new int[10];
		int pares=0;
		int impares=0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Me escreva o valor do número (" + (i+1) + ")");
			numeros[i] = teclado.nextInt();
		}
		for (int i = 0; i <10; i++) {
			if (numeros[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("A porcentagem de pares são: " + (pares * 100.0) / 10);
		System.out.println("A porcetagem de impares são: " + (impares * 100.0) / 10);
	}

}
