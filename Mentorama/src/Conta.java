
public abstract class Conta {
	private int numero;
	private int agencia;
	private String banco;
	protected double saldo = 0;	
	
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
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	//O QUE FOI PEDIDO NA QUESTÃO
	public abstract boolean sacar(double valor) {
		return false;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
		
	public Conta(int numero, int agencia, String banco, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.banco = banco;
		this.saldo = saldo;		
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
