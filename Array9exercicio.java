package segundosemestrearray;
import java.util.Scanner;
public class Array9exercicio {

	public static void main(String[] args) {
		// Crie um programa onde um usuário deverá informar os dados de altura e sexo de 10 pessoas. Imprima na tela quantas pessoas são do sexo masculino e quantas pessoas são do sexo feminino.
		// Mostre também qual é a maior altura e se essa altura é de um homem ou uma mulher.

		Scanner teclado = new Scanner(System.in);
		double altura[] = new double[10];
		String genero[] = new String[10];
		int sexof = 0;
		int sexom = 0;
		double AM=0, AF=0;
		int indicemaiorM, indicemaiorF;
		
		
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Me diga o gênero do primeiro paciênte " + (i+1) + ":");
			genero[i] = teclado.nextLine();
			
			System.out.println("Me diga a altura do paciênte " + (i+1) + ":");
			altura[i] = teclado.nextInt();
			teclado.nextLine();
			
			
			if (genero[i].equalsIgnoreCase("F")) {
			    sexof++;

			    if (altura[i] > AF) {
			        AF = altura[i];
			    }
			} 
			else if (genero[i].equalsIgnoreCase("M")) {
			    sexom++;

			    if (altura[i] > AM) {
			        AM = altura[i];
			    }
			}
		}
	
		System.out.println("Tivemos "+ sexom + " pacientes masculinos e " + sexof + " pacientes de sexo feminino!");
		System.out.println("Altura do maior paciênte masculino:" + AM);
		System.out.println("Altura do maior paciênte masculino:" + AF);
		
	}
}	
		//for (int i = 0; i < 10; i++) {
		//	System.out.println("Paciente " + (i+1) + ":Gênero = " + genero[i] + ", Altura = " + altura[i] + " m" );
		
		
		
		
		
		
		
		
		
		
	


