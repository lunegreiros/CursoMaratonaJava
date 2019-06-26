/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.Gassociacao.exercicio;

/**
 *
 * @author Visitante
 */
public class AssociacaoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Joao Pedro Cardoso", 23);
        Aluno aluno2 = new Aluno("Madalena Albertina", 45);
        Seminario sem = new Seminario("Criadores de Mamao");
        Professor prof = new Professor("Carlos Augusto", "Urologista");
        Local local = new Local("Avenida Marins", "Centro");
        
        // criar as associacoes
        // 1 - dos alunos
        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);
        
        // 2 - dos seminarios
        sem.setProfessor(prof);
        sem.setLocal(local);
        // *************** IMP ************
//        sem.setAlunos(new Aluno[](aluno,aluno2));
        
        // 3 - dos professores
//        prof.setSeminarios(new Seminario[](sem));
        
        
        // chamar a classe print dentro de aluno
        //aluno.print();
        
    }
}
