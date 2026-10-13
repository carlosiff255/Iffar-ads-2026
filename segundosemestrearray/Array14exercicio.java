package segundosemestrearray;
import java.util.Random;
public class Array14exercicio {

	public static void main(String[] args) {
		// Crie um programa que preencha automaticamente um vetor numérico com 7 números, entre 1 e 50, gerados aleatoriamente pelo computador e depois mostre os valores gerados na tela.
		// Dica: use a classe Random

		int[] numero = new int[8];
		double min = 1;
		double max = 50;
		Random random = new Random();
		
		for (int i = 0; i < 7; i++) {
			numero[i] = random.nextInt(50);
				if (i==0) {
					System.out.println("Este são os valores aleatórios:");
				}
		System.out.println(numero[i]);
		}
	}
}
