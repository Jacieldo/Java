
public class ContaCorrente extends Conta {
	private double chequeEspecial;

	//CONSTRUTOR
	public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
		super(numero, agencia, banco, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public String toString() {
		return super.toString() + "Conta Corrente{" + "Cheque Especial =" + chequeEspecial +
				'}';
	}
	
	@Override
	public boolean sacar(double valor) {
		double disponivel =  this.chequeEspecial + this.saldo;
		if (valor > disponivel) {
			System.out.println("Saldo insuficiente!!!");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public double getSaldo() {
		return this.chequeEspecial + this.saldo;
	}

}
