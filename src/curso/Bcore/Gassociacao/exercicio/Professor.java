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
public class Professor {
    private String nome;
    private String especialidade;
    
        // criar as asscoacoes com outras CLASSES
    private Seminario[] seminarios;
    
    // os CONSTRUTORES com todos os atributos e um vazio
    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professor(){
    }
    
    // METODO print
    public void print(){
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        for (Seminario sem : seminarios){
            System.out.println(sem.getTitulo()+" ");
        }
    }
    
    // METODOS set e get
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
