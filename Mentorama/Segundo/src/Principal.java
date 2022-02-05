import um.Primeiro;

public class Principal {
	public static void main(String[] args){
		Primeiro primeiro = new Primeiro();
		Primeiro outraClassePrimeiro = new Primeiro();
		primeiro.metodoPublico();
		outraClassePrimeiro.alteraVariavel();
		primeiro.metodoPublico();

	}
}
