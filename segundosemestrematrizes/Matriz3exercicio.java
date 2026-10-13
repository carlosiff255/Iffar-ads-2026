package segundosemestrematrizes;
import java.util.Scanner;
public class Matriz3exercicio {

	public static void main(String[] args) {
		// Faça um programa que preencha uma matriz 4 x 4 com o produto do valor da linha e da coluna de cada elemento. Em seguida, imprima na tela a matriz.
		
		Scanner teclado = new Scanner(System.in);
		int [][] matriz = new int[4][4];
		int pos = 0;
		int posicao = 0;
		
		for (int lin = 0; lin < matriz.length; lin++) { 
			for (int col = 0; col < matriz.length; col++) {
			matriz [lin][col] = lin * col;
			System.out.println("O valor do produto da linha " + lin + " e da coluna " + col + " é " + matriz[lin][col]);
			}
		}
	}
}
