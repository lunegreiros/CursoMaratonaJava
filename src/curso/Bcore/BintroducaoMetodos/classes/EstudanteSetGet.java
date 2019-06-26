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
//Aula 36 encapsulamento da classe
public class EstudanteSetGet {
    // eu vou proteger os atributos dessa classe
    // o modificador de visualizacao 'private' permite que SOMENTE ESSA CLASSE
    // visualize esses atributos
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;
    
    // como os atributos sao 'private' eles precisam de um METODO para acessar
    // e para setar esses atributos.
    // para colocar um valos - criamos um METODO usando o SET<nome_atributo>
    public void setNome(String nome){
        this.nome = nome;
    }
    // mais um METODO com SET agora para os atributos 'idade' e para 'notas'
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    // para acessar os valores - criamos um METODO usando GET<nome_atributo>
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double[] getNotas(){
        return this.notas;
    }
    //para atrbutos booleanos usamos o IS<nome_atributo>
    public boolean isAprovado(){
        return this.aprovado;
    }
    
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        for(double nota : this.notas) {
            System.out.print(nota+" ");
        }
    }
    
    public void media(){
        double media = 0;
        for(double nota : this.notas){
            media += nota;
        }
        media /= this.notas.length;
        if(media > 6){
            aprovado = true;
            System.out.println("Aprovado");
        }else {
            aprovado = false;
            System.out.println("Reprovado");
        }
    }
}
