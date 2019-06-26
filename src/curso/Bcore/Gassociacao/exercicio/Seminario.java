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
public class Seminario {
    private String titulo;
    
    // criando as associacoes com outras CLASSES
    // cuidado com a relacao PARA MUITOS - precisa de ARRAYS
    private Aluno[] alunos;
    private Local local;
    private Professor professor;
    
    // os CONSTRUTORES com todos os atributos e um vazio
    public Seminario(String titulo){
        this.titulo = titulo;
    }
    public Seminario(){
    }
    
    // METODO para imprimir
    public void print(){
        System.out.println(this.titulo);
    }
    
   
    //METODOS get e set
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    // METODOS set e get das assciacoes

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
}
