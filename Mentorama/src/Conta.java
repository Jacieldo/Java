
public abstract class Conta {
	private int numero;
	private int agencia;
	private String banco;
	protected double saldo;
	protected double deposito;
	protected double saque;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	
	
	public abstract double getSaldo();
	
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public double getSaque() {
		return saque;
	}
	public Conta(int numero, int agencia, String banco, double saldo, double deposito, double saque) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.banco = banco;
		this.saldo = saldo;
		this.deposito = deposito;
		this.saque = saque;
		
	}
	
	@Override
	public String toString() {
		return "Conta{" +
				"numero=" + numero +
				", agencia=" + agencia +
				", banco='" + banco + '\'' +
				", saldo" + saldo +
				'}';
	}
	

}
