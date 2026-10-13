package segundosemestrearray;
import java.util.Scanner;
public class Array5exercicio {

	public static void main(String[] args) {
		//  Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No final, mostre uma listagem com todos os nomes informados, na ordem inversa daquela em que eles foram informados.

		Scanner teclado = new Scanner(System.in);
		String nomes;
		String[] vetor = new String[7];
		
		for (int i = 0; i <= 6; i++) {
			System.out.println("Digite o nome " + (i + 1) + ":");
			vetor[i] = teclado.nextLine();
		}
		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.println("Resposta: " + vetor[i]);
			
		}
		

	}

}
