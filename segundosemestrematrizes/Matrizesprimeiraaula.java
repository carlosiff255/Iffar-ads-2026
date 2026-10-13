package segundosemestrematrizes;
import java.util.Scanner;
public class Matrizesprimeiraaula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);	
		int [][] matriz = new int[2][2];
		
		for(int lin = 0 ; lin < 2; lin++ ) {
			for(int col = 0; col <2 ; col++) {
				System.out.println("Informe os valores");
				matriz [lin][col] = teclado.nextInt();
			}
		}
		
		for (int lin = 0;lin < 2; lin++) {
			for (int col = 0; col < 2; col++) {
				System.out.println(matriz[lin][col] + "");
			}
		}
	}
}
