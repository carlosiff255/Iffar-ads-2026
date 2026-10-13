package segundosemestrearray;
import java.util.Scanner;
public class Array8exercicio {

	public static void main(String[] args) {
		//  Crie um programa que leia as notas de uma turma de 10 alunos. Guarde-as em um vetor, calcule a média da turma e conte quantos alunos obtiveram nota acima desta média calculada. 
		// Escrever a média da turma e o resultado da contagem. 

		Scanner teclado = new Scanner(System.in);
		int notas[] = new int[10];
		int soma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Escreva a nota do aluno: " + (i+1) );
			notas[i] = teclado.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			soma += notas[i];	
		}
		System.out.print("A soma das notas dos 10 alunos é " + soma   + ". E a média é: " + (soma/10));
	}

}
