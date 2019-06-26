package curso.Bcore.Minterfaces.teste;

//Aula 62

import curso.Bcore.Minterfaces.classes.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p = new Produto("Celular", 0.3, 2300);
        
        // chamar os METODOS para calcular imposto e frete
        p.calcularImposto();
        p.calculaFrete();
        
        System.out.println(p);
    }
}
