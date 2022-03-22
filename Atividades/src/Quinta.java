public class Quinta {
	
	public static void main(String[] args) {
		//Tipo primitivo
		int var1 = 5;
		float var2 = 3.14f;
		double var3 = 6.989675;
		byte var4 = 1;
		
		//a partir da versão 9 não será mais necessário fazer referencias
		Integer varA = var1; 
		Float varB = var2;
		Double varC = var3;
		Byte varD = var4;
		
		//Impressão dos valores
		System.out.println("Integer - " + varA);
		System.out.println("Float - " + varB);
		System.out.println("Double - " + varC);
		System.out.println("Byte - " + varD);

	}

}
