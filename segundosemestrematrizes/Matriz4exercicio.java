package segundosemestrematrizes;
import java.util.Scanner;
public class Matriz4exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int [][] matriz = new int[2][2];
		int pos = 0;
		int posicao = 0;
		
		for (int lin = 0; lin < 2; lin++) { //como só tem duas linhas e duas colunas, é dessa forma que guardamos
			for (int col = 0; col < 2; col++) {
				System.out.println("Informe os valores");
				matriz [lin][col] = teclado.nextInt();		
			}
		}
		int maiorvalor = matriz[0][0];
		int maiorlin = 0;
		int maircol = 0;
		
		for (int lin = 0; lin < 2; lin++) {
			for (int col = 0; col < 2; col++) {
				if (matriz[lin][col] > maiorvalor) {
					maiorvalor = matriz[lin][col];
					maiorlin = lin;
					maircol = col;
				}
			}
		}
		System.out.print("Seu maior valor é: " + maiorvalor + ", que está na linha: " + maiorlin + " e na coluna: " + maircol);
	}
}