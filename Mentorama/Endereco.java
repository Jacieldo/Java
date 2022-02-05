import java.util.Scanner;

public class Endereco {
    public static void main(String[] args) {
        System.out.println("-----CADASTRO DE USUÁRIO-----");

        Scanner scanner = new Scanner(System.in);
        
        // Solicitar o nome completo
        System.out.println("Digite o seu nome completo: ");
        String nome = scanner.nextLine();
        
        // rua
        System.out.println("Insira a rua: ");
        String rua = scanner.nextLine();
        
        // número
        System.out.println("Insira o número da residência: ");
        String numero = scanner.nextLine();

        // bairro
        System.out.println("Insira o bairro: ");
        String bairro = scanner.nextLine();
        
        // cidade
        System.out.println("Insira a Cidade: ");
        String cidade = scanner.nextLine();
        
        // estado
        System.out.println("Digite o estado: ");
        String estado = scanner.nextLine();

        // CEP
        System.out.println("Digite o CEP: ");
        String cep = scanner.nextLine();

        // EXIBIR AS INFORMAÇÕES FORMATADAS
        System.out.println("Nome Completo: " + nome);
        System.out.println("Endereço: " + rua + ", " + numero + ", " + bairro + ", " + cidade + "-" + estado);
        System.out.println("CEP: " + cep);

        
    }
    
}
