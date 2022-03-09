package atividade;

public class Conta {
    private int numero;
    private double saldo;
    private int agencia;
    private int diaAbertura;
    private int mesAbertura;
    private int anoAbertura;
    
    

    public Conta(){
        numero = 1234;
        saldo = 554;
        agencia = 0044;
        diaAbertura = 26;
        mesAbertura = 10;
        anoAbertura = 2014;
    }

    public int getNumero(){
        return (numero);
    }
    public void setNumero(int numero){
        this.numero = numero;
    }


    public double getSaldo() {
        return (saldo);
    }
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }

    
    
}
