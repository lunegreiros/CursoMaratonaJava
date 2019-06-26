/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.BintroducaoMetodos.teste;

import curso.Bcore.BintroducaoMetodos.classes.Estudante;

/**
 *
 * @author Visitante
 */
//Aula 35 - exercicio
public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        
        aluno.nome = "Joao";
        aluno.idade = 18;
        // CUIDADO com a inicializacao de Arrays
        aluno.notas = new double[] {3.5, 5.0, 9.0};
        
        // chamar o METODO de impressao
        aluno.imprime();
        aluno.media();
        
    }
    
}
