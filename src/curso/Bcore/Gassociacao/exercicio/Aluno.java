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
public class Aluno {

    private String nome;
    private int idade;

    // criar as asscoacoes com outras CLASSES
    private Seminario seminario;

    // os CONSTRUTORES com todos os atributos e um vazio
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    // METODO para imprimir
    public void print() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.seminario != null) {
            System.out.println(this.seminario.getTitulo());
        } else {
            System.out.println("Nenhum seminario cadastrado");
        }
    }

    // METODOS GET e SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // METODO get e set para a classe SEMINARIO
    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
