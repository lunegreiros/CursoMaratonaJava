package curso.Bcore.Npolimorfismo.classes;

//Aula 64 - polimorfimsom
public class Gerente extends Funcionario {
    private double pnl; // participacao nos lucros
    
    // OBRIGADO a implementar o construtor GERENTE pois o PAI FUNCIONARIO
    // eh ABSTRACT // repare na SOBRECARGA com a var local 'pnl'
    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }
    //implementar todos os METODO ABSTRACTS de FUNCIONARIO
    @Override
    public void calculoPagamento() {
        this.salario = this.salario + pnl;
    }

// METODOS GET E SET
    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }

}
