import java.util.Scanner;

class Primeira {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");

        var entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String s = entrada.next();

        System.out.println("Oi " + s + ", tudo bem?");
    }
}

