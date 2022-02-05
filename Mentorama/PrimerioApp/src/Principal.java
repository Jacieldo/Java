import java.io.IOException;

public class Principal {
	public static void limparTela() throws IOException, InterruptedException {
		new ProcessBuilder ("cmd", "/c", "cls").inheritIO().start().waitFor();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Integer soma (Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}

	private void metodoVoid() {

	}
	private int metodoInt(){ 

	}
	

}
