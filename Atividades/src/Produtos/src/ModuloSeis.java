import java.util.Scanner;
import java.util.ArrayList;


public class ModuloSeis {
	
	public static void main(String[] args) {
		//Implementação de um sistema de presença 
		//QUE PROFESSOR PERDIDO...
		
		Scanner scanner = new Scanner(System.in);
		
		int numAlunos;
		int aulas;
		
		System.out.print("Quantos aulunos há na turma: "); //NÃO FOI PASSADO INFORMAÇÕES SUFICIENTES PRA "AMARRAR" O PROGRAMA
		
		numAlunos = scanner.nextInt();
		System.out.print("Quantas aulas: ");
		aulas = scanner.nextInt();
		
		String chamada[][] = new String[numAlunos][aulas+1];
		
		int i, j;
		
		for (i = 0; i < numAlunos; i++) {
			System.out.print(i+1 + "° aluno: ");
			chamada[i][0] = scanner.next();			
		}	
		
		System.out.println("p se estiver presente ou f para faltante");
		
		for (i = 0; i < aulas; i++) { //Cada Aula conta todos os alunos depois retete para outra aula
			System.out.println("--- Presença da "+ (i+1) + " aula ---");
			for (j = 0; j < numAlunos; j++) {
				System.out.print(chamada[j][0]);
				chamada[j][i+1] = scanner.next();				
			}
		}
		
		
		//IMPRESSÃO DA MATRIZ
		for (i = 0; i < numAlunos; i++) {
			for (j = 0; j < (aulas + 1); j++) {
				System.out.print(chamada[i][j] +" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
