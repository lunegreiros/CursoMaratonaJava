package curso.Bcore.Hheranca.classes;

public class Funcionario extends Pessoa{
    private double salario;
    
    // caso a SUPERCLASSE tiver um CONSTRUTOR diferente do padrao
    // a SUBCLASSE tem que definir o construtor que deve ser chamado
    public Funcionario(String nome){
        // aqui eu preciso chamar o CONSTRUTOR da SUPERCLASSE
        //e enviar o 'nome' obrigatorio do CONSTRUTOR da subclasse funcionario
        super(nome);
    }
    //METODO para imprimir esse atributo local
    public void print(){
        // chamar o METODO da CLASSE PAI - usa o prefixo SUPER
        super.print();
        System.out.println("salario: "+this.salario);
        printRecibo();
    }
    
    // uma outra impressao acessando os atributos do PAI 'protected'
    public void printRecibo(){
        System.out.println("Eu, "+super.nome+" recebi: "+this.salario);
    }
    
    // METODOS get e set
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
