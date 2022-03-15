package view;

public class Carro {
   private int numeroPortas;
   private String cor;
   private int numeroChassi;
   private int anoFabricacao;
   private String combustivel;
   private float motorizacao;
   private int quantidadeRodas;
   
   public Carro (int numeroPortas, int numeroChassi, int anoFabricacao, String combustivel) {
	   this.numeroPortas = numeroPortas;
	   this.numeroChassi = numeroChassi;
	   this.anoFabricacao = anoFabricacao;
	   this.combustivel = combustivel;
   }
   
   public void setCor (String cor) {
	   this.cor = cor;
   }
   
   public void setMotorizacao (float motorizacao) {
	   this.motorizacao = motorizacao;
   }
   
   public void setQuantidadeRodas (int quantidadeRodas) {
	   this.quantidadeRodas = quantidadeRodas;
   }

}
