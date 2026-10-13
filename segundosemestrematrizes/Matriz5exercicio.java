package segundosemestrematrizes;
import java.util.Scanner;
import java.util.Random;
public class Matriz5exercicio {

	public static void main(String[] args) {
		//  Leia uma matriz 5 x 5. Leia também um valor "X". O programa deverá fazer uma busca desse valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma mensagem de
		// “não encontrado”.


		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		int [][] matriz = new int[2][2];
		int valor = 0;
		int valorguardado = 0;
		int linha = 0;
		int coluna = 0;
		
		System.out.println("Me fale um valor, vou acha-lo na matriz de 5x5");
		valor = teclado.nextInt();
		
		for (int lin = 0; lin < matriz.length; lin++) {
			for (int col = 0; col < matriz.length; col++) {
				matriz[lin][col] = aleatorio.nextInt(3);
				System.out.println(matriz[lin][col]);
				if (matriz[lin][col] == valor ) {
					matriz[lin][col] = valorguardado;
					linha = lin;
					coluna = col;
				}
				else if (matriz[lin][col] != valor) {
					System.out.print("Não encontrado");
				}
			}
		}
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);
		System.out.println("Valor colocado no início: " + valor);
		System.out.println ("Valor guardado: " + valorguardado);
		
	}
}
