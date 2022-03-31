
public class ContaSalario extends Conta {
	public int limiteSaques;

	//CONSTRUTOR
	public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteSaque) {
		super(numero, agencia, banco, saldo);
		this.limiteSaques = limiteSaque;
	}

	@Override
	public String toString() {
		return super.toString() + "ContaSalario{" + 
				"quantidadeSaques=" + limiteSaques + "}";
	}
	
	@Override
	public double getSaldo() {
		return this.saldo;		
	}
	
	@Override
	public boolean sacar(double valor) {
		if (valor > saldo) {
			return false;
		} else {
			if (this.limiteSaques > 0) {
				this.limiteSaques--;
				this.saldo -= valor;
				return true;				
			} else {
				System.out.println("Limite de Saques excedido!!!");
				return false;				
			}
		}
	}
	

}
