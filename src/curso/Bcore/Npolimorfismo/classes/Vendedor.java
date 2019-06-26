package curso.Bcore.Npolimorfismo.classes;

//Aula 64 - polimorfismo
public class Vendedor extends Funcionario{
    private double totalVendas;
    
    // OBRIGADO a implementar o construtor VENDEDOR pois o PAI FUNCIONARIO
    // eh ABSTRACT // repare na SOBRECARGA com a var local 'totalVendas'
    public Vendedor(String nome, double salario, double totalVendas){
        super(nome,salario);
        this.totalVendas = totalVendas;
    }
    
        //implementar todos os METODO ABSTRACTS de FUNCIONARIO
    @Override
    public void calculoPagamento(){
        this.salario = this.salario + (totalVendas * 0.05);
    }
    
    // CRIAR objetos
    
    //METODO get e set
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
