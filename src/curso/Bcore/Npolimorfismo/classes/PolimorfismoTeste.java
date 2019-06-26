package curso.Bcore.Npolimorfismo.classes;

//AUla 64
public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Paula", 2300, 100);
        Vendedor v = new Vendedor("Enzo", 4000, 50000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
        
//        relatorio.relatorioGerente(g);
//        System.out.println("---------------");
//        relatorio.relatorioVendedor(v);
        relatorio.relatorioGenerico(g);
        System.out.println("---------------");
        relatorio.relatorioGenerico(v);

    }
}
