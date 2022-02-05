import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("*****Calculadora*****");

        int opcao;
        do {
            System.out.println("1 - Somar");
            System.out.println("2 - Subitrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.print("O que deseja fazer? (0 pra sair)");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            processar(opcao);
        } while (opcao != 0);        
    }

    public static void processar(int opcao) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        switch(opcao){
            case 1: { //Somar
                System.out.println("+++SOMANDO DOIS NÚMEROS+++");
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextInt();

                System.out.printf("A soma dos dois números é: %d\n\n", num1 + num2);
                break;
            }
            case 2: { //Subitrair
                System.out.println("---SUBRITRAINDO DOIS NÚMEROS---");
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextInt();

                System.out.printf("A subritração entre os números é: %d\n\n", num1 - num2);
                break;                
            }
            case 3: { //Multiplica
                System.out.println("***MULTIPLICANDO DOIS NÚMEROS***");
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextInt();

                System.out.printf("A multiplicação entre os números é = %d\n\n", num1 * num2);
                break;
            }
            case 4: { //Dividir
                System.out.println("///DIVIDINDO DOIS NÚMEROS///");
                System.out.print("Digite o primeiro número: ");
                double num3 = scanner.nextInt();
                System.out.print("Dgite o segundo número: ");
                double num4 = scanner.nextInt();                

                if (num4 == 0) {
                    System.out.println("Impossível dividir por 0!");
                } else {
                    System.out.printf("A multiplicação entre os números é = %f\n\n", num3 / num4);
                }                
                break;
            }
        }
    }
}