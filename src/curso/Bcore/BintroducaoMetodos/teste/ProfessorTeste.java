/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.BintroducaoMetodos.teste;

import curso.Bcore.BintroducaoMetodos.classes.Professor;

/**
 *
 * @author Visitante
 */
//Aula 31 passagem de parametros via referencia
public class ProfessorTeste {
    public static void main(String[] args) {
        // chamar a classe 'Professor' e criar um OBJETO
        Professor prof = new Professor();
        Professor prof2 = new Professor();
        
        // inicializar com valores da instancia
        prof.cpf = "294.691.548-56";
        prof.matricula = 34567;
        prof.nome = "Joao Alfredo";
        prof.rg = "29.314.955-2";
        
        // inicializar com valores da instancia
        prof2.cpf = "xxx.691.548-56";
        prof2.matricula = 35557;
        prof2.nome = "Xavier Alfredo";
        prof2.rg = "xx.314.955-2";
        
        // chamar o METODO 'imprime' passando os argumntos 'prof' e 'prof2'
        prof.imprime(prof);
        prof.imprime(prof2);
        
    }
    
}
