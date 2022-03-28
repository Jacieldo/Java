import models.Produto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

import db.ProdutosDB;
import db.UsuariosDB;

public class Main {
	static ProdutosDB produtosDB = new ProdutosDB();
	static UsuariosDB usuariosDB = new UsuariosDB();
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("---PEDIDO DE VENDAS---");
		
		int option;
		
		do {
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos Cadastrados");
			System.out.println("3 - Cadastrar Usuário ADMINISTRADOR");
			System.out.println("4 - Cadastrar Usuário CLIENTE");
			System.out.println("5 - Listar todos os Usuários");
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
					System.out.println("--- ID: " + Produto.getId());
					System.out.println("--- Descrição: " + Produto.getDescricao());
					System.out.println("--- Preço: " + Produto.getPreco());
					System.out.println("--- Data de validade: " + Produto.getDataValidade());
					System.out.println("-----------------------------------------");
				}
				break;
				
			}
			
			case 3: {
				
				break;
			}
			
			case 4: {
				
				break;
			}
			
			case 5: {
				
				break;
			}
		
		}
		
	}

}
