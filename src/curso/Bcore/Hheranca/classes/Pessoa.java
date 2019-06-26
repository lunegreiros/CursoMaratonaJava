package curso.Bcore.Hheranca.classes;

public class Pessoa {

    protected String nome;
    protected String cpf;
    // associar a classe endereco
    protected Endereco endereco;

    // construtor para criacao de objetos
    // construtor com PARAMETRO significa que para construir um OBJETO
    // eh obrigatorio passar o ARGUMENTO
    public Pessoa(String nome){
        this.nome = nome;
    }

    // METODO para imprimir
    public void print(){
        System.out.println("nome: "+this.nome);
        System.out.println("cpf: "+this.cpf);
        System.out.println("endereco: "+this.endereco.getRua());
    }
    
    // METODOS get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
