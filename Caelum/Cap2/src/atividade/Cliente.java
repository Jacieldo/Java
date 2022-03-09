package atividade;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String nascimento;
    private String telefone;
    private Conta conta = new Conta();

    public Cliente() {
        nome = "Jacieldo";
        cpf = "026.164.983-32";
        endereco = "R Francisco Moura Araújo";
        nascimento = "26/10/1988";
        telefone = "(86) 98159-6764";
    }
    
    public String getNome() {
        return (nome);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return (cpf);
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEndereco() {
        return(endereco);
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }


    public String getNascimento() {
        return (nascimento);
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }


    public String getTelefone() {
        return(telefone);
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
   
}

