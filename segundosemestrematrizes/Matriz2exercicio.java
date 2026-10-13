package segundosemestrematrizes;
import java.util.Scanner;
public class Matriz2exercicio {

	public static void main(String[] args) {
		// Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos. Escreva ao final a matriz obtida.

		Scanner teclado = new Scanner(System.in);
		int [][] matriz = new int[4][4];
		
		for (int lin = 0; lin < matriz.length; lin++) {
			for (int col = 0; col < matriz.length; col++) {
				if (col >= 1) {
					matriz[lin][col] = 1;
				}
				else if (col == 0) {
					matriz[lin][col] = 0;
				}
				System.out.print(matriz[lin][col]);
			}
			System.out.println();
		}
	}

}
