package curso.Bcore.Labstrata.teste;

//

import curso.Bcore.Labstrata.classes.Funcionario;
import curso.Bcore.Labstrata.classes.Gerente;
import curso.Bcore.Labstrata.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        //Funcionario f = new Funcionario("Joana Feli", "2345-234", 2300);
        Gerente g = new Gerente("Pedro Alca", "3456-67", 3400);
        Vendedor v = new Vendedor("Maria Costa", "234-2", 3000, 50);
        
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(g);
        System.out.println("---------"); 
        System.out.println(v);
    }
}
