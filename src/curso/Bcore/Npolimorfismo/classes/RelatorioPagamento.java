package curso.Bcore.Npolimorfismo.classes;

//Aula 64 - polimorfismo
public class RelatorioPagamento {

    /*
    public void relatorioGerente(Gerente gerente) {
        System.out.println("Relatorio do gerente");
        gerente.calculoPagamento();
        System.out.println("nome: " + gerente.getNome()
                + ", salario: " + gerente.getSalario());
    }

    public void relatorioVendedor(Vendedor vendedor) {
        System.out.println("Relatorio do vendedor");
        vendedor.calculoPagamento();
        System.out.println("nome: " + vendedor.getNome()
                + ", salario: " + vendedor.getSalario());
    }
     */
    public void relatorioGenerico(Funcionario funcionario) {
        System.out.println("Relatorio:");
        funcionario.calculoPagamento();
        System.out.println("nome: " + funcionario.getNome()
                + ", salario: " + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            // para 'funcionario' (PAI) ENXERGAR todo o 'gerente' (FILHO)
            // vc precisa fazer CAST para o FILHO (+ especifico)
            Gerente g = (Gerente) funcionario;
            // assim eu consigo acessar os atributos de 'Gerente'
            System.out.println("participacao nos lucros: " + g.getPnl());
        }
        if (funcionario instanceof Vendedor){
            Vendedor v = (Vendedor) funcionario;
            System.out.println("Total de vendas: "+v.getTotalVendas());
        }

    }
}
