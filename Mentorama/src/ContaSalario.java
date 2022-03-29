
public class ContaSalario extends Conta {
	public int limiteSaque;

	
	public ContaSalario(int numero, int agencia, String banco, double saldo, double deposito, double saque, int limiteSaque) {
		super(numero, agencia, banco, saldo, deposito, saque);
		this.limiteSaque = limiteSaque;
	}




	public double getSaldo() {
		return this.saldo;
		
	}
	

}
