package curso.Bcore.Isobrescrita.teste;
//Aula 55 - sobrescrita de METODOS

import curso.Bcore.Isobrescrita.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        p.setNome("Alfredo");
        p.setIdade(45);
        
        //
        System.out.println(p);
    }
}
