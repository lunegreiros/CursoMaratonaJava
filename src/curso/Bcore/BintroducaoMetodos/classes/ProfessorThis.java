/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.BintroducaoMetodos.classes;

/**
 *
 * @author Visitante
 */
//Aula 32 passagem de parametros via referencia e usando THIS
public class ProfessorThis { 
    public String nome;
    public int matricula;
    public String rg;
    public String cpf;
    
    // dentro dessa classe eu vou criar um METODO para imprimir
    // os ATRIBUTOS ou valores da instancia assim
    // eu devo criar um METODO que NAO recebe argumento
    // assim usa o THIS para executar os valores de DENTRO do objeto
    public void imprime(){
        System.out.println(
                this.cpf+", "+
                this.nome+", "+
                this.rg+", "+
                this.matricula);
    }
    
}
