
public class ContaPoupanca extends Conta {
	private int diaAniversario;
	private double taxaJuros;	

	
	public ContaPoupanca(int numero, int agencia, String banco, double saldo, double deposito, double saque,
			int diaAniversario, double taxaJuros) {
		super(numero, agencia, banco, saldo, deposito, saque);
		this.diaAniversario = diaAniversario;
		this.taxaJuros = taxaJuros;
	}



	public double getSaldo() {
		return this.saldo + this.taxaJuros * this.saldo;
	}
	
	

}
