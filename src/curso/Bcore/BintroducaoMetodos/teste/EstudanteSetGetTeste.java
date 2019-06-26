/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.BintroducaoMetodos.teste;

import curso.Bcore.BintroducaoMetodos.classes.EstudanteSetGet;

/**
 *
 * @author Visitante
 */
//Aula 36 encapsulamento da classe
public class EstudanteSetGetTeste {
    public static void main(String[] args) {
        EstudanteSetGet aluno = new EstudanteSetGet();
        
        // passar valores como argumentos, por se tratar de METODOS de classe
        aluno.setNome("Joao");
        aluno.setIdade(18);
        // CUIDADO com a inicializacao de Arrays
        aluno.setNotas(new double[]{4, 5.6, 9});
        
        // para acessar o valor de 'nome'
        System.out.println(aluno.getNome());
        //acessar a info se ele foi aprovado ou nao
        System.out.println("Aprovado? "+aluno.isAprovado());
        
        
        // chamar o METODO de impressao
        aluno.imprime();
        aluno.media();
        
    }
    
}
