package curso.Bcore.Labstrata.classes;

//Aula 60 - classes abstratas
public class Gerente extends Funcionario {

    //SOBRESCRITA de calcula salario - que eh uma SUPERCLASSE ABSTRACT
    // vc eh OBRIGADO A SOBRESCREVER porque a superclasse eh ABSTRACT
    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.2);
    }

    @Override
    public void print() {
        System.out.println("Dentro da classe gerente // sobrescrito");
    }

    //CONSTRUTOR da superclasse
    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

}
