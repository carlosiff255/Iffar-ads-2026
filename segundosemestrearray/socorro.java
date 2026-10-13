package segundosemestrearray;
import java.util.Random;
import java.util.Scanner;
public class socorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner teclado = new Scanner(System.in);

		int vetor[] = new int[30];
		int digitado[] = new int[5];
		int acertados = 0;

		for (int i = 0; i < 30; i++) {

		    vetor[i] = random.nextInt(5);

		    if (i == 29) {

		        for (int e = 0; e < 5; e++) {

		            if (e == 0) {
		                System.out.print("Me diga um valor: ");
		            }

		            digitado[e] = teclado.nextInt();

		            for (int b = 0; b < 30; b++) {

		                if (digitado[e] == vetor[b]) {

		                    System.out.println(
		                        "Acertou o número " + digitado[e] +
		                        " na posição " + (b + 1)
		                    );

		                    acertados++;
		                    vetor[b] = -1;
		                }
		            }
		        }
		    }
		}

		System.out.println("Total de acertos: " + acertados);
	}

}
