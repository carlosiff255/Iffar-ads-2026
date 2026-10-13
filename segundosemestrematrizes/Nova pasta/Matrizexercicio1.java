package segundosemestrematrizes;
import java.util.Scanner;
public class Matrizexercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int [][] matriz = new int[2][2];
		
		for (int lin = 0; lin < matriz.length; lin ++) {
			for (int col = 0; col < matriz.length; col++) {
				System.out.print("Informe os valores - ");
				matriz [lin][col] = teclado.nextInt();
			}
		}
		
		for (int lin = 0; lin < matriz.length; lin++) {
			for (int col = 0; col < matriz.length; col++) {
				if (matriz[lin][col] > 10) {
				System.out.println(matriz[lin][col]);	
				}
			}
		}
	}

}
