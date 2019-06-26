/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.BintroducaoMetodos.teste;

import curso.Bcore.BintroducaoMetodos.classes.ProfessorThis;

/**
 *
 * @author Visitante
 */
//Aula 32 passagem de parametros via referencia e usando THIS
public class ProfessorThisTeste {
    public static void main(String[] args) {
        // chamar a classe 'ProfessorThis' e criar um OBJETO
        ProfessorThis prof = new ProfessorThis();
        ProfessorThis prof2 = new ProfessorThis();
        
        // inicializar com valores da instancia
        prof.cpf = "294.691.548-56";
        prof.matricula = 34567;
        prof.nome = "Albertina Alfredo";
        prof.rg = "29.314.955-2";
        
        // inicializar com valores da instancia
        prof2.cpf = "xxx.691.548-56";
        prof2.matricula = 35557;
        prof2.nome = "Bettina Alfredo";
        prof2.rg = "xx.314.955-2";
        
        // chamar o METODO 'imprime' SEM passar argumntos
        // pois o METODO dentro da classe 'ProfessorThis' utiliza o THIS
        prof.imprime();
        prof2.imprime();
        
    }
    
}
