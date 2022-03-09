class Conta {
    double saldo;
    int numero;
    Cliente titular;

    public boolean saca (double valor) {
        if (this.saldo < valor){
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }        
    }
    
    public void deposita(double valorDeposito){
        this.saldo += valorDeposito;
    }
}
