import models.Produto;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import db.ProdutosDB;

public class Main {
	static ProdutosDB produtosDB = new ProdutosDB();
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("---PEDIDO DE VENDAS---");
		
		int option;
		
		do {
			System.out.println("1 - Cadastrar Produto");
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
				
				System.out.print("Descrição do novo produto:");
				String descricao = scanner.nextLine();
				
				System.out.print("Preço: ");
				double preco = scanner.nextDouble();
				
				System.out.print("Data de validade: ");
				String dataString = scanner.next();
				
				Date dataValidade = new SimpleDateFormat(pattern, "dd/mm/yyyy").parse(dataString);
				
				Produto novoProduto = new Produto(id, descricao, preco, dataValidade);
				
				System.out.println("Produto Criado com Sucesso: ");
				System.out.println("---ID: " + novoProduto.getId());
				System.out.println("--- Descrição: " + novoProduto.getDescricao());
				System.out.println("--- Preço: " + novoProduto.getPreco());
				System.out.println("--- Data de validade: " + novoProduto.getDataValidade());
				System.out.println("-----------------------------------------");
			}
		
		}
		
	}

}
