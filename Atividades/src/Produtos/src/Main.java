import db.EstoquesDB;
import db.ProdutosDB;
import db.UsuariosDB;
import models.Admin;
import models.Cliente;
import models.Estoque;
import models.Produto;
import models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.List;




public class Main {
	static ProdutosDB produtosDB = new ProdutosDB();
	static UsuariosDB usuariosDB = new UsuariosDB();
	static EstoquesDB estoquesDB = new EstoquesDB();
	
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("---PEDIDO DE VENDAS---");
		
		int option;
		
		do {
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos Cadastrados");
			System.out.println("3 - Cadastrar Usuário ADMINISTRADOR");
			System.out.println("4 - Cadastrar Usuário CLIENTE");
			System.out.println("5 - Listar todos os Usuários");
			System.out.println("6 - Cadastrar novo estoque de Produtos");
			System.out.println("7 - Listar Estoque");
			System.out.println("0 - Sair");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Qual operação deseja realizar: ");
			option = scanner.nextInt();
			
			process(option);		
		} while(option != 0);
	}
	
	public static void process (int option) throws Exception{
		switch (option) {
			case 1: {
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("Descrição do novo produto: ");
				String descricao = scanner.nextLine();
				
				System.out.print("ID do produto: ");
				int id = scanner.nextInt();
				
				System.out.print("Preço: ");
				double preco = scanner.nextDouble();
				
				System.out.print("Data de validade: ");
				String dataString = scanner.next();
				
				Date dataValidade = new SimpleDateFormat("dd/mm/yyyy").parse(dataString);
				
				Produto novoProduto = new Produto(id, descricao, preco, dataValidade);
				
				produtosDB.addNovoProduto(novoProduto);
				break;
			}
			
			case 2: {
				List<Produto> listaProdutos = produtosDB.getProdutosList();
				
				for(Produto produto : listaProdutos) {				
					System.out.println("--- ID: " + produto.getId());
					System.out.println("--- Descrição: " + produto.getDescricao());
					System.out.println("--- Preço: " + produto.getPreco());
					System.out.println("--- Data de validade: " + produto.getDataValidade());
					System.out.println("-----------------------------------------");
				}
				break;
				
			}
			
			case 3: {
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("Qual o nome do Usuário ADMIN:");
				String nome = scanner.nextLine();
				
				Admin novoAdmin = new Admin(nome);
				usuariosDB.addNovoUsuario(novoAdmin);
				break;
			}
			
			case 4: {
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("Qual o nome do CLIENTE: ");
				String nome = scanner.nextLine();
				
				Cliente novoCliente = new Cliente(nome);
				usuariosDB.addNovoUsuario(novoCliente);
				
				break;
			}
			
			case 5: {
				System.out.println("-----------------------------------------");
				System.out.println("------LISTANDO USUÁRIOS CADASTRADOS------");
				System.out.println("-----------------------------------------");
				for(Usuario usuario : usuariosDB.getUsuariolist()) {
					System.out.println("ID: " + usuario.getId());
					System.out.println("Nome: " + usuario.getNome());
					System.out.println("Tipo: " + usuario.getTipoUsuario());
					System.out.println("-----------------------------------------");
				}
				
				break;
			}
			
			case 6: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("-------------------------------------  ----");
				System.out.println("------CADASTRANDO ESTOQUE DE PRODUTOS------");
				System.out.println("---------------------------------------  --");
				
				System.out.print("Qual o ID do estoque: ");
				String id = scanner.next();
				
				System.out.print("Qual o produto será adicionado (informe o ID): ");
				int produtoId = scanner.nextInt();
				
				Produto produto = produtosDB.getProdutoPorID(produtoId);		
				System.out.println("PRODUTO ID: " + produto.getId());
				System.out.println("PRODUTO DESCRIÇÃO: " + produto.getDescricao());
				System.out.println("PRODUTO VALIDADE: " + produto.getDataValidade());
				
				System.out.println("Quantos produtos serão adicionados: ");
				int quantidade = scanner.nextInt();
				
				Estoque novoEstoque = new Estoque(produto, quantidade, id);
				estoquesDB.addNovoEstoque(novoEstoque);
				
				break;				
			}
			
			case 7: {
				System.out.println("---------------------------------------");
				System.out.println("------LISTANDO ESTOQUE CADASTRADO------");
				System.out.println("---------------------------------------");
				for(Estoque estoque : estoquesDB.getEstoque()) {
					System.out.println("ID: " + estoque.getId());
					System.out.println("Nome: " + estoque.getProduto().getDescricao());
					System.out.println("Tipo: " + estoque.getProduto().getPreco());
					System.out.println("QUANTIDADE: " + estoque.getQuantidade());
					System.out.println("-----------------------------------------");
				}
				
				
				
				break;
			}
		
		}
		
	}

}
