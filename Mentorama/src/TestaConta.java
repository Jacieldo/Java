
public class TestaConta {

	public static void main(String[] args) {
		
		
		/**
		ContaCorrente cc1 = new ContaCorrente(22, 1, "BancoBrasil", 10.00, 0, 0, 1000.00);
		System.out.println(cc1);
		
		System.out.println("O saldo da conta Corrente é R$ "+cc1.getSaldo());
		
		ContaPoupanca p1 = new ContaPoupanca(33, 3, "NuConta", 10.00, 0, 0, 26, 0.05);
		System.out.println("O saldo da conta poupança é R$" +p1.getSaldo());
		**/
		
		Conta contas[] = new Conta[3];
		
		ContaCorrente cc = new ContaCorrente(1, 0044, "NuBank", 53.40, 100);
		ContaPoupanca cp = new ContaPoupanca(1, 001, "BB", 234.43, 26, 0.5);
		ContaSalario cs = new ContaSalario(3, 0003, "Santander", 890, 3);
		
		contas[0] = cc;
		contas[1] = cp;
		contas[2] = cs;
		
		// cc.sacar(10);
		
		System.out.println("Saldo das contas: ");
		for (Conta conta:contas) {
			System.out.println(conta);
			System.out.println("Saldo atual: R$"+conta.getSaldo()); //POLIMORFISMO
			System.out.println("-----------------------------------");
		}
		
		
	}	

}
