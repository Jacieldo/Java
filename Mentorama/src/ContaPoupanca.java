
public class ContaPoupanca extends Conta {
	private int diaAniversario;
	private double taxaJuros;	

	//CONSTRUTOR
	public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaJuros) {
		super(numero, agencia, banco, saldo);
		this.diaAniversario = diaAniversario;
		this.taxaJuros = taxaJuros;
	}
	

	@Override
	public String toString() {
		return super.toString() + "ContaPoupanca [diaAniversario=" + diaAniversario + ", "
				+ "taxaJuros=" + taxaJuros + "]";
	}


	public double getSaldo() {
		return this.saldo + this.taxaJuros * this.saldo;
	}
	
	@Override
	public boolean sacar(double valor) {
		this.saldo -= valor;
		return true;
	}	

}
