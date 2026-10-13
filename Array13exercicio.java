package segundosemestrearray;
import java.util.Scanner;
public class Array13exercicio {

	public static void main(String[] args) {
		//  Crie um vetor A contendo 6 números com o gabarito da Mega Sena. A seguir, crie um vetor B que receba 10 números de uma aposta, informados pelo usuário.
		//	Escrever quantos números o apostador acertou.

		Scanner teclado = new Scanner(System.in);	
		int mega[] = {9,2,1,5,6,7};
		int megas[] = {9,2,1,5,6,7};
		int aposta[] = new int[10];
		int acertados = 0;
		int acertado;
		
		System.out.println("Me digite 10 valores: ");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Valor atual: " + (i+1));
			aposta[i] = teclado.nextInt();
			if (aposta[i] < 10) {
			}
			else {
				System.out.println("Valor acima de 10, digite novamente:");
				i--;
			}
			 for (int j = 0; j < 6; j++) {
				 if (aposta[i] == mega[j]) { 
					 acertados++;
					 mega[j] = 0;
				 	}
			}
			
		}
		
		//fazer outra variavel para controlar se houve um acerto do numero
		
		System.out.println("Valores acertados: " + acertados);
		System.out.println("Esse é o gabarito:");
		for (int i = 0; i < 6;i++) {
			System.out.print(megas[i]);	
		}
		
		
		
	}
	
}

