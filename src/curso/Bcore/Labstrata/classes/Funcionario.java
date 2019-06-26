package curso.Bcore.Labstrata.classes;

//Aula 60 - classes abstratas
// clsses ABSTRACT nao podem ser instanciadas (criar objetos com ela)
// ela soh serve para ser COPIADAS pelos seus FILHOS 
public abstract class Funcionario extends Pessoa{

    protected String clt;
    protected double salario;
    
    //calculo de salario
    //esse METODO eh ABSTRACT, ele NAO PODE ter codigo de implementacao,
    // que eh o codigo dentro de { ... }
    // e ele DEVE ser SOBRESCRITO nas classes que foram EXTENDIDAS dessa
    // ou seja, os FILHOS de FUNCIONARIOS
    public abstract void calculaSalario();
    
    // SOBRESCREVER toString
    @Override
    public String toString() {
        return "nome: " + nome + ", clt: " + clt + ", salario: " + salario;
    }    
    
    //CONSTRUTOR vazio e um com todos os atributos
    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }
    
    
    //METODOS set e get
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
