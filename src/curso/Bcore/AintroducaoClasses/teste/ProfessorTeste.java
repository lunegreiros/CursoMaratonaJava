/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.AintroducaoClasses.teste;

import curso.Bcore.AintroducaoClasses.classes.Professor;

/**
 *
 * @author Visitante
 */
//Aula 26: exercicio e classe > preencher os dados da instancia e imprimir
public class ProfessorTeste {
    public static void main(String[] args) {
        // chamar a classe 'Professor'
        // e como esta em outro package, ele importa o package (logo acima)
        Professor professor = new Professor();
        
        // inicializar os valores de instancia
        professor.nome = "Alfredo Correa";
        professor.matricula = 23490;
        professor.rg = "29.665-78";
        professor.cpf = "34.567-32";
        
        // exibir os campos
        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
    }
    
}
