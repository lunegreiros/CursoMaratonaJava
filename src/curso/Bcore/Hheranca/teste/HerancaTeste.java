package curso.Bcore.Hheranca.teste;

import curso.Bcore.Hheranca.classes.Endereco;
import curso.Bcore.Hheranca.classes.Funcionario;
import curso.Bcore.Hheranca.classes.Pessoa;

public class HerancaTeste {

    public static void main(String[] args) {
        //criar var e objetos baseado nas classes
        Pessoa p = new Pessoa("Pedro de alcantara");
        Endereco end = new Endereco();
        Funcionario f = new Funcionario("Augusto Vieira");

        // inicializar cada objeto
        p.setCpf("234535-90");
        end.setRua("Palmeiras 34");
        end.setBairro("Centro");
        // associar o ENDERECO a PESSOA
        p.setEndereco(end);
        
        //
        f.setCpf("345745-10");
        f.setEndereco(end);
        f.setSalario(3400);

        // METODO print
        p.print();
        System.out.println("-----------");
        f.print();

    }
}
