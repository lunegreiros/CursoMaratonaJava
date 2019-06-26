package curso.Bcore.Npolimorfismo.classes;

//AULA 64 - polimorfismo
public abstract class Funcionario {
    protected String nome;
    protected double salario;
    
    //sobrescrita toString
    @Override
    public String toString(){
        return "nome: "+nome+", salario: "+salario;
    }
    //CONSTRUTOR
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
//todo funcionario deve calcular seu pagamento, portanto precisamos de um
// METODO que todos os funcionarios irao usar, seja gerente ou vendedor
    public abstract void calculoPagamento();
    
    //METODO get e set
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
