import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("---MENU---");
            System.out.println("--> 1. Opção 1 ");
            System.out.println("--> 2. Opção 2 ");
            System.out.println("--> 3 SAIR ");
            Scanner menu = new Scanner(System.in);

            System.out.println("Selecione uma opção: ");
            opcao = menu.nextInt();
        
            menu(opcao);
        }while (opcao != 3);
    }
        
public static void menu (int opcao){
        switch (opcao) {
        case 1:
            System.out.println("Opção 1 selecionada");
            break;
        case 2:
            System.out.println("Opção 2 selecionada");
            break;
        case 3:
            System.out.println("O programa foi finalizado!");
            break;
        default:
            System.out.println("Seleção Inválida");
            break;
        }
    }    
}
