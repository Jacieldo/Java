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
		
		String chamada[][] = new String[numAlunos][aulas];
		
		
		for (int i = 0; i < numAlunos; i++) {
			System.out.println("aluno: ");
			chamada[i][0] = scanner.next();
			
		}	
		
	}

}
