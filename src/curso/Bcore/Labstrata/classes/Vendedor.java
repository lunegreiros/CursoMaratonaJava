package curso.Bcore.Labstrata.classes;

//Aula 60 - classes abstratas
public class Vendedor extends Funcionario{
    private double totalVendas;
    
    //CONSTRUTORES da classe
    public Vendedor(String nome, String clt, double salario, double totalVendas) 
    {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }
    public Vendedor(){
    }
   

    // vc eh OBRIGADO A SOBRESCREVER porque a superclasse eh ABSTRACT
    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.05);
    }
    @Override
    public void print(){
        System.out.println("Dentro do metodo imprime // sobrescrito");
    } 
    
    //METODOS set e get
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
}
