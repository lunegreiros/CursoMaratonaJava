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
//Aula 31 passagem de parametros via referencia
public class Professor {
    public String nome;
    public int matricula;
    public String rg;
    public String cpf;
    
    // dentro dessa classe eu vou criar um METODO para imprimir
    // os ATRIBUTOS ou valores da instancia assim
    // eu devo criar um METODO que recebe um ARGUMENTO DO TIPO PROFESSOR:
    public void imprime(Professor aux){
        System.out.println(
                aux.cpf+", "+
                aux.nome+", "+
                aux.rg+", "+
                aux.matricula);
    }
    
}
