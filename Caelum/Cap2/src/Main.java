import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		//Menu para escolher a questão a ser feita
		int opcao;

		do {
			System.out.println("***ESCOLHA A QUESTÃO QUE DESEJA***");
			System.out.println("1 - Contar de 150 a 300");
			System.out.println("2 - ");
			System.out.println("3 - ");
			System.out.println("4 - ");
			System.out.println("5 - ");
			System.out.println("6 - ");
			System.out.println("7 - ");
			System.out.println("8 - ");
			System.out.println("0 - Para SAIR...");
			Scanner questoes = new Scanner(System.in);

			System.out.println("Digite o número da questão: ");
			opcao = questoes.nextInt();

			questoes(opcao);
		}while (opcao != 0);
	}

	

public questoes () {
	switch (opcao) {
		case 0:
			System.out.println("Fim do programa!!");
			break;
		case 1: 
			System.out.println("Contando de 150 a 300");

			for (int i = 150; i <= 160; i++) {
				System.out.println(i);
			}
			break;
		}

	}

}
