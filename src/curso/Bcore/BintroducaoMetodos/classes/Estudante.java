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
//Aula 35 - exercicio
public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;
    
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
            System.out.println("Aprovado");
            return;
        }
        System.out.println("Reprovado");
    }
}
