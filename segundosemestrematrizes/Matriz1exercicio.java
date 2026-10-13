package segundosemestrematrizes;
import java.util.Scanner;
public class Matriz1exercicio {

	public static void main(String[] args) {
		// Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.

		Scanner teclado = new Scanner(System.in);
		int [][] matriz = new int[2][2];
		int maioresque10 = 0;
		int linha = 0;
		int maiorvalor = 0;
		
		for (int lin = 0; lin < matriz.length; lin++) {
			for (int col = 0; col < matriz.length; col++) {
				linha++;
				System.out.println("Me diga o valor " + linha);
				matriz [lin][col] = teclado.nextInt();
			}
		}
		System.out.print("E os valores foram: ");
		
		for (int lin = 0; lin < matriz.length; lin++) {
			for (int col = 0; col < matriz.length; col++) {
				if (matriz[lin][col] > 10) {
					maioresque10++;
					maiorvalor = matriz[lin][col];
					System.out.println(maiorvalor + " ");
				}
			}
		}
		System.out.println("Você conseguiu " + maioresque10 + " valores maiores que 10!");	
	}
}
