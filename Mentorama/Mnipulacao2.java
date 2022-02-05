import java.io.IOException;
import java.util.Scanner;

public class Mnipulacao2 {

/* Através da claúsula THROWS indicamos que não iremos tratar possíveis erros na entreda de dados realizada através do método "read" do pacote de classes System.in */

/* CLAÚSULA THROWS - Podem ser entendidas como ações que propagam exceções, ou seja, em alguns momentos existem exceções que não podem ser tratadas no mesmo método que gerou a exceção. Nesses casos, é necessário propagar a execeção para um nível acima na pilha. */
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        String nome;
        char sexo;

        System.out.println("Informe um nome: ");
        nome = ler.nextLine();

        System.out.println("\nInforme o sexo (M/F): \n");
        sexo = (char)System.in.read();

        if ((sexo == 'M') || (sexo == 'm'))
            System.out.printf("\nSeja bem-vindo Sr. %s.\n", nome);
        else
            System.out.printf("\nSeja bem-vinda Sra. %s.\n", nome);        
    }
    
}
