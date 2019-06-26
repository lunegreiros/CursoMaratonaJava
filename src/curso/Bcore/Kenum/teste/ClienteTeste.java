package curso.Bcore.Kenum.teste;

//Aula 57 - Enumeracoes
import curso.Bcore.Kenum.classes.Cliente;
import curso.Bcore.Kenum.classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anna Bara", 
                TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.A_VISTA);
        System.out.println(cliente);
    }
}
